package com.lemon.demo.service;

import com.lemon.demo.model.SysPermissionInit;
import com.lemon.demo.core.universal.Service;

import java.util.List;

/**
* @Description: SysPermissionInitService接口
* @author Qy
* @date 2019/02/27 13:13
*/
public interface SysPermissionInitService extends Service<SysPermissionInit> {
    List<SysPermissionInit> selectAllOrderBySort();
}