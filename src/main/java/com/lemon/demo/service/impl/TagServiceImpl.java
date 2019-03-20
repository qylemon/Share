package com.lemon.demo.service.impl;

import com.lemon.demo.dao.TagMapper;
import com.lemon.demo.model.Tag;
import com.lemon.demo.service.TagService;
import com.lemon.demo.core.universal.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* @Description: TagService接口实现类
* @author Qy
* @date 2019/02/27 17:19
*/
@Service
public class TagServiceImpl extends AbstractService<Tag> implements TagService {

    @Resource
    private TagMapper tagMapper;

}