package com.lemon.demo.controller;

import com.lemon.demo.core.ret.RetResult;
import com.lemon.demo.core.ret.RetResponse;
import com.lemon.demo.core.ret.ServiceException;
import com.lemon.demo.core.utils.ApplicationUtils;
import com.lemon.demo.model.Note;
import com.lemon.demo.service.NoteService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: NoteController类
* @author Qy
* @date 2019/02/27 17:19
*/
@RestController
@RequestMapping("/note")
public class NoteController {

    @Resource
    private NoteService noteService;

    @PostMapping("/insert")
    public RetResult<Integer> insert(Note note) throws Exception{
//      note.setId(ApplicationUtils.getUUID());
        Integer state = noteService.insert(note);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/deleteById")
    public RetResult<Integer> deleteById(@RequestParam String id) throws Exception {
        Integer state = noteService.deleteById(id);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/update")
    public RetResult<Integer> update(@RequestBody Note note) throws Exception {
        Integer state = noteService.update(note);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/selectById")
    public RetResult<Note> selectById(@RequestBody String id) throws Exception {
        Note note = noteService.selectById(id);
        if (note == null){
            throw new ServiceException("没有找到该信息！");
        }
        return RetResponse.makeOKRsp(note);
    }

    /**
    * @param page 页码
    * @param size 每页条数
    * @Description: 分页查询
    * @Reutrn RetResult
    * <PageInfo<SystemLog>>
    */
    @PostMapping("/selectAll")
    public RetResult<PageInfo<Note>> list(@RequestParam(defaultValue = "0") Integer page,@RequestParam(defaultValue = "0") Integer size) throws Exception {
        PageHelper.startPage(page, size);
        List<Note> list = noteService.selectAll();
        PageInfo<Note> pageInfo = new PageInfo<Note>(list);
        return RetResponse.makeOKRsp(pageInfo);
     }
}