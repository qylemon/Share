package com.lemon.demo.dao;

import com.lemon.demo.core.universal.Mapper;
import com.lemon.demo.model.SysPermissionInit;

import java.util.List;

public interface SysPermissionInitMapper extends Mapper<SysPermissionInit> {
    List<SysPermissionInit> selectAllOrderBySort();
}