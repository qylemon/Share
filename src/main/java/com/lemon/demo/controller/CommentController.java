package com.lemon.demo.controller;

import com.lemon.demo.core.ret.RetResult;
import com.lemon.demo.core.ret.RetResponse;
import com.lemon.demo.core.ret.ServiceException;
import com.lemon.demo.core.utils.ApplicationUtils;
import com.lemon.demo.model.Comment;
import com.lemon.demo.service.CommentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: CommentController类
* @author Qy
* @date 2019/02/27 17:19
*/
@RestController
@RequestMapping("/comment")
public class CommentController {

    @Resource
    private CommentService commentService;

    @PostMapping("/insert")
    public RetResult<Integer> insert(Comment comment) throws Exception{
//      comment.setId(ApplicationUtils.getUUID());
        Integer state = commentService.insert(comment);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/deleteById")
    public RetResult<Integer> deleteById(@RequestParam String id) throws Exception {
        Integer state = commentService.deleteById(id);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/update")
    public RetResult<Integer> update(@RequestBody Comment comment) throws Exception {
        Integer state = commentService.update(comment);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/selectById")
    public RetResult<Comment> selectById(@RequestBody String id) throws Exception {
        Comment comment = commentService.selectById(id);
        if (comment == null){
            throw new ServiceException("没有找到该信息！");
        }
        return RetResponse.makeOKRsp(comment);
    }

    /**
    * @param page 页码
    * @param size 每页条数
    * @Description: 分页查询
    * @Reutrn RetResult
    * <PageInfo<SystemLog>>
    */
    @PostMapping("/selectAll")
    public RetResult<PageInfo<Comment>> list(@RequestParam(defaultValue = "0") Integer page,@RequestParam(defaultValue = "0") Integer size) throws Exception {
        PageHelper.startPage(page, size);
        List<Comment> list = commentService.selectAll();
        PageInfo<Comment> pageInfo = new PageInfo<Comment>(list);
        return RetResponse.makeOKRsp(pageInfo);
     }
}