package com.lemon.demo.service.impl;

import com.lemon.demo.dao.UserRoleMapper;
import com.lemon.demo.model.UserRole;
import com.lemon.demo.service.UserRoleService;
import com.lemon.demo.core.universal.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: UserRoleService接口实现类
* @author Qy
* @date 2019/02/27 13:03
*/
@Service
public class UserRoleServiceImpl extends AbstractService<UserRole> implements UserRoleService {

    @Resource
    private UserRoleMapper userRoleMapper;

    @Override
    public List<String> getRolesByUserId(Integer userId) {
        return userRoleMapper.getRolesByUserId(userId);
    }

}