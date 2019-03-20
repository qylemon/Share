package com.lemon.demo.service.impl;

import com.lemon.demo.dao.SysRoleMapper;
import com.lemon.demo.model.SysRole;
import com.lemon.demo.service.SysRoleService;
import com.lemon.demo.core.universal.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* @Description: SysRoleService接口实现类
* @author Qy
* @date 2019/02/27 13:03
*/
@Service
public class SysRoleServiceImpl extends AbstractService<SysRole> implements SysRoleService {

    @Resource
    private SysRoleMapper sysRoleMapper;

}