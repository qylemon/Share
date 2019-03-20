package com.lemon.demo.service.impl;

import com.lemon.demo.dao.SysPermissionInitMapper;
import com.lemon.demo.model.SysPermissionInit;
import com.lemon.demo.service.SysPermissionInitService;
import com.lemon.demo.core.universal.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: SysPermissionInitService接口实现类
* @author Qy
* @date 2019/02/27 13:13
*/
@Service
public class SysPermissionInitServiceImpl extends AbstractService<SysPermissionInit> implements SysPermissionInitService {

    @Resource
    private SysPermissionInitMapper sysPermissionInitMapper;

    @Override
    public List<SysPermissionInit> selectAllOrderBySort() {
        return sysPermissionInitMapper.selectAllOrderBySort();
    }
}