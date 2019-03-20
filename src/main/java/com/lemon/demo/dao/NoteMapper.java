package com.lemon.demo.dao;

import com.lemon.demo.core.universal.Mapper;
import com.lemon.demo.model.Note;

import java.util.List;

public interface NoteMapper extends Mapper<Note> {
    List<Note> selectAll();
}