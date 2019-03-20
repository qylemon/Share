package com.lemon.demo.service.impl;

import com.lemon.demo.dao.UserMapper;
import com.lemon.demo.model.User;
import com.lemon.demo.service.UserService;
import com.lemon.demo.core.universal.AbstractService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @Description: UserService接口实现类
* @author Qy
* @date 2019/02/25 16:31
*/
@Service
public class UserServiceImpl extends AbstractService<User> implements UserService {

    @Resource
    private UserMapper userMapper;

}