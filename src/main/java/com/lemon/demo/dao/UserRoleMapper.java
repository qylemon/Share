package com.lemon.demo.dao;

import com.lemon.demo.core.universal.Mapper;
import com.lemon.demo.model.UserRole;

import java.util.List;

public interface UserRoleMapper extends Mapper<UserRole> {
    List<String> getRolesByUserId(Integer userId);
    List<UserRole> selectAll();
}