package com.lemon.demo.service;

import com.lemon.demo.model.UserRole;
import com.lemon.demo.core.universal.Service;

import java.util.List;

/**
* @Description: UserRoleService接口
* @author Qy
* @date 2019/02/27 13:03
*/
public interface UserRoleService extends Service<UserRole> {
    List<String> getRolesByUserId(Integer userId);
    List<UserRole> selectAll();
}