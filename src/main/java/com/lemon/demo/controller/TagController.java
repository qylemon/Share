package com.lemon.demo.controller;

import com.lemon.demo.core.ret.RetResult;
import com.lemon.demo.core.ret.RetResponse;
import com.lemon.demo.core.ret.ServiceException;
import com.lemon.demo.core.utils.ApplicationUtils;
import com.lemon.demo.model.Tag;
import com.lemon.demo.service.TagService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: TagController类
* @author Qy
* @date 2019/02/27 17:19
*/
@RestController
@RequestMapping("/tag")
public class TagController {

    @Resource
    private TagService tagService;

    @PostMapping("/insert")
    public RetResult<Integer> insert(@RequestBody Tag tag) throws Exception{
        System.out.println(tag);
        Integer state = tagService.insert(tag);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/deleteById")
    public RetResult<Integer> deleteById(@RequestParam String id) throws Exception {
        Integer state = tagService.deleteById(id);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/update")
    public RetResult<Integer> update(@RequestBody Tag tag) throws Exception {
        Integer state = tagService.update(tag);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/selectById")
    public RetResult<Tag> selectById(@RequestBody String id) throws Exception {
        Tag tag = tagService.selectById(id);
        if (tag == null){
            throw new ServiceException("没有找到该信息！");
        }
        return RetResponse.makeOKRsp(tag);
    }

    /**
    * @param page 页码
    * @param size 每页条数
    * @Description: 分页查询
    * @Reutrn RetResult
    * <PageInfo<SystemLog>>
    */
    @PostMapping("/selectAll")
    public RetResult<PageInfo<Tag>> list(@RequestParam(defaultValue = "0") Integer page,@RequestParam(defaultValue = "0") Integer size) throws Exception {
        PageHelper.startPage(page, size);
        List<Tag> list = tagService.selectAll();
        PageInfo<Tag> pageInfo = new PageInfo<Tag>(list);
        return RetResponse.makeOKRsp(pageInfo);
     }
}