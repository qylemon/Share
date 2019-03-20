package com.lemon.demo.controller;

import com.lemon.demo.core.ret.RetResult;
import com.lemon.demo.core.ret.RetResponse;
import com.lemon.demo.core.utils.ApplicationUtils;
import com.lemon.demo.model.SysRole;
import com.lemon.demo.service.SysRoleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: SysRoleController类
* @author Qy
* @date 2019/02/27 13:03
*/
@RestController
@RequestMapping("/sysRole")
public class SysRoleController {

    @Resource
    private SysRoleService sysRoleService;

    @PostMapping("/insert")
    public RetResult<Integer> insert(SysRole sysRole) throws Exception{
//      sysRole.setId(ApplicationUtils.getUUID());
        Integer state = sysRoleService.insert(sysRole);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/deleteById")
    public RetResult<Integer> deleteById(@RequestParam String id) throws Exception {
        Integer state = sysRoleService.deleteById(id);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/update")
    public RetResult<Integer> update(SysRole sysRole) throws Exception {
        Integer state = sysRoleService.update(sysRole);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/selectById")
    public RetResult<SysRole> selectById(@RequestParam String id) throws Exception {
        SysRole sysRole = sysRoleService.selectById(id);
        return RetResponse.makeOKRsp(sysRole);
    }

    /**
    * @param page 页码
    * @param size 每页条数
    * @Description: 分页查询
    * @Reutrn RetResult
    * <PageInfo<SystemLog>>
    */
    @PostMapping("/selectAll")
    public RetResult<PageInfo<SysRole>> list(@RequestParam(defaultValue = "0") Integer page,@RequestParam(defaultValue = "0") Integer size) throws Exception {
        PageHelper.startPage(page, size);
        List<SysRole> list = sysRoleService.selectAll();
        PageInfo<SysRole> pageInfo = new PageInfo<SysRole>(list);
        return RetResponse.makeOKRsp(pageInfo);
     }
}