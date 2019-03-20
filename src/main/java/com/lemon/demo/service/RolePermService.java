package com.lemon.demo.service;

import com.lemon.demo.model.RolePerm;
import com.lemon.demo.core.universal.Service;

import java.util.List;

/**
* @Description: RolePermService接口
* @author Qy
* @date 2019/02/27 13:03
*/
public interface RolePermService extends Service<RolePerm> {
    List<String> getPermsByUserId(Integer userId);
    List<RolePerm> selectAll();
}