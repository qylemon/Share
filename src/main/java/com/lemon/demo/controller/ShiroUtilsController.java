package com.lemon.demo.controller;

import com.lemon.demo.core.ret.RetResponse;
import com.lemon.demo.model.User;
import com.lemon.demo.service.ShiroService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Qy
 * @Date: 2019-02-26 10:37
 */

@RestController
@RequestMapping("shiroUtils")
public class ShiroUtilsController {

    @Autowired
    private ShiroService shiroService;

    @GetMapping("/noLogin")
    public void noLogin() {
        throw new UnauthenticatedException();
    }

    @GetMapping("/noAuthorize")
    public void noAuthorize() {
        throw new UnauthorizedException();
    }


    @PostMapping("/getNowUser")
    public User getNowUser() {
        User u = (User) SecurityUtils.getSubject().getPrincipal();
        return u;
    }

    /**
     * @Description: 重新加载shiro权限
     * @throws Exception
     */
    @PostMapping("/updatePermission")
    public Object updatePermission() throws Exception {
        shiroService.updatePermission();
        return RetResponse.makeRsp(200,"更新权限成功！！！");
    }

}
