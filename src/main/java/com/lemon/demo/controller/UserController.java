package com.lemon.demo.controller;

import com.lemon.demo.core.ret.RetResult;
import com.lemon.demo.core.ret.RetResponse;
import com.lemon.demo.core.ret.ServiceException;
import com.lemon.demo.core.utils.ApplicationUtils;
import com.lemon.demo.model.User;
import com.lemon.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.xml.internal.xsom.impl.UName;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Example;
import javax.annotation.Resource;
import java.util.List;

/**
* @Description: UserController类
* @author Qy
* @date 2019/02/25 16:31
*/
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    public User getUserByName(String userName) {
        User u =userService.selectBy("userName",userName);
        return u;
    }

    @PostMapping("/insert")
    public RetResult<Integer> insert(User user) throws Exception{
        User u = this.getUserByName(user.getUserName());
        if (u != null){
            throw new ServiceException("用户名已存在！");
        }
        user.setPassword(ApplicationUtils.pwdmd(user.getPassword()));
        user.setSalt(ApplicationUtils.salt(user.getPassword()));
        Integer state = userService.insert(user);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/deleteById")
    public RetResult<Integer> deleteById(@RequestParam String id) throws Exception {
        Integer state = userService.deleteById(id);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/update")
    public RetResult<Integer> update(User user) throws Exception {
        user.setPassword(ApplicationUtils.pwdmd(user.getPassword()));
        user.setSalt(ApplicationUtils.salt(user.getPassword()));
        Integer state = userService.update(user);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/selectById")
    public RetResult<User> selectById(@RequestParam String id) throws Exception {
        User user = userService.selectById(id);
        if (user == null){
            throw new ServiceException("暂无该用户");
        }
        return RetResponse.makeOKRsp(user);
    }

    /**
    * @param page 页码
    * @param size 每页条数
    * @Description: 分页查询
    * @Reutrn RetResult
    * <PageInfo<SystemLog>>
    */
    @PostMapping("/selectAll")
    public RetResult<PageInfo<User>> list(@RequestParam(defaultValue = "0") Integer page,@RequestParam(defaultValue = "8") Integer size) throws Exception {
        PageHelper.startPage(page, size);
        List<User> list = userService.selectAll();
        PageInfo<User> pageInfo = new PageInfo<User>(list);
        return RetResponse.makeOKRsp(pageInfo);
     }

    @PostMapping("/login")
    public RetResult<User> login(@RequestBody User users) {
        Subject currentUser = SecurityUtils.getSubject();
        //登录
        try {
            currentUser.login(new UsernamePasswordToken(users.getUserName(), users.getPassword()));
        }catch (IncorrectCredentialsException i){
            throw new ServiceException("密码输入错误");
        }
        //从session取出用户信息
        User user = (User) currentUser.getPrincipal();
        return RetResponse.makeOKRsp(user);
    }

    @PostMapping("/logout")
    public RetResult<User> logout() {
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.logout();
        return RetResponse.makeRsp(200,"退出登录");
    }

}