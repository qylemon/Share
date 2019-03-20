package com.lemon.demo.service.impl;

import com.lemon.demo.dao.SysPermMapper;
import com.lemon.demo.model.SysPerm;
import com.lemon.demo.service.SysPermService;
import com.lemon.demo.core.universal.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* @Description: SysPermService接口实现类
* @author Qy
* @date 2019/02/27 13:03
*/
@Service
public class SysPermServiceImpl extends AbstractService<SysPerm> implements SysPermService {

    @Resource
    private SysPermMapper sysPermMapper;

}