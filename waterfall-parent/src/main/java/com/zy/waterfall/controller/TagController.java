package com.zy.waterfall.controller;


import com.zy.waterfall.common.entity.Tag;
import com.zy.waterfall.common.result.Result;
import com.zy.waterfall.service.ITagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  标签
 * </p>
 *
 * @author Wzy
 * @since 2020-08-13
 */
@Slf4j
@RestController
@RequestMapping("/tag")
public class TagController {

    @Autowired
    private ITagService tagService;

    /**
     * 查询所有标签
     * @return
     */
    @GetMapping(value = "/findAll")
    public Result<List<Tag>> findAll(){
        Result<List<Tag>> result = new Result<>();
        List<Tag> list = tagService.list();
        log.info("the tagList is {}",list);
        result.success("success");
        result.setResult(list);
        return result;
    }

    /**
     * 添加修改
     * @param tag
     * @return
     */
    @PostMapping(value = "/saveTag")
    public Result saveTag(@RequestBody Tag tag){
        log.info("the tag is {}",tag);
        boolean b = tagService.saveOrUpdate(tag);
        if (b)
            return Result.ok("success!!!");
        else return Result.error("come to nothing!!!");
    }

    /**
     * 删除标签
     * @param id
     * @return
     */
    @DeleteMapping(value = "/deleteTag/{id}")
    public Result deleteTag(@PathVariable Integer id){
        log.info("the id is {}",id);
        boolean b = tagService.removeById(id);
        if (b)
            return Result.ok("success!!!");
        else return Result.error("come to nothing!!!");
    }

}

