package com.lemon.demo.service.impl;

import com.lemon.demo.dao.RolePermMapper;
import com.lemon.demo.model.RolePerm;
import com.lemon.demo.service.RolePermService;
import com.lemon.demo.core.universal.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: RolePermService接口实现类
* @author Qy
* @date 2019/02/27 13:03
*/
@Service
public class RolePermServiceImpl extends AbstractService<RolePerm> implements RolePermService {

    @Resource
    private RolePermMapper rolePermMapper;

    @Override
    public List<String> getPermsByUserId(Integer userId) {
        return rolePermMapper.getPermsByUserId(userId);
    }
}