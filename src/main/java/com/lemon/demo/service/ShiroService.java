package com.lemon.demo.service;

import java.util.Map;

/**
 * @Author: Qy
 * shiro 动态更新权限
 * @Date: 2019-02-26 15:09
 */
public interface ShiroService {

    Map<String, String> loadFilterChainDefinitions();

    /**
     * 动态修改权限
     */
    void updatePermission();
}
