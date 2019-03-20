package com.lemon.demo.service;

import com.lemon.demo.model.Note;
import com.lemon.demo.core.universal.Service;

import java.util.List;

/**
* @Description: NoteService接口
* @author Qy
* @date 2019/02/27 17:19
*/
public interface NoteService extends Service<Note> {
    List<Note> selectAll();
}