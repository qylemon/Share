package com.lemon.demo.service.impl;

import com.lemon.demo.dao.NoteMapper;
import com.lemon.demo.model.Note;
import com.lemon.demo.service.NoteService;
import com.lemon.demo.core.universal.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* @Description: NoteService接口实现类
* @author Qy
* @date 2019/02/27 17:19
*/
@Service
public class NoteServiceImpl extends AbstractService<Note> implements NoteService {

    @Resource
    private NoteMapper noteMapper;
}