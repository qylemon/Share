package com.lemon.demo.dao;

import com.lemon.demo.core.universal.Mapper;
import com.lemon.demo.model.Comment;

import java.util.List;

public interface CommentMapper extends Mapper<Comment> {
    List<Comment> selectAll();
}