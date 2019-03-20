package com.lemon.demo.dao;

import com.lemon.demo.core.universal.Mapper;
import com.lemon.demo.model.RolePerm;

import java.util.List;

public interface RolePermMapper extends Mapper<RolePerm> {
    List<String> getPermsByUserId(Integer userId);
    List<RolePerm> selectAll();
}