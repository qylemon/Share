package com.lemon.demo.service.impl;

import com.lemon.demo.dao.CommentMapper;
import com.lemon.demo.model.Comment;
import com.lemon.demo.service.CommentService;
import com.lemon.demo.core.universal.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* @Description: CommentService接口实现类
* @author Qy
* @date 2019/02/27 17:19
*/
@Service
public class CommentServiceImpl extends AbstractService<Comment> implements CommentService {

    @Resource
    private CommentMapper commentMapper;

}