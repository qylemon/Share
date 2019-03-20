package com.lemon.demo.service;

import com.lemon.demo.model.Comment;
import com.lemon.demo.core.universal.Service;

import java.util.List;

/**
* @Description: CommentService接口
* @author Qy
* @date 2019/02/27 17:19
*/
public interface CommentService extends Service<Comment> {
    List<Comment> selectAll();
}