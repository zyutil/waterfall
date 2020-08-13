package com.zy.waterfall.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zy.waterfall.service.ClassifyService;
import com.zy.waterfall.common.entity.Classify;
import com.zy.waterfall.common.result.Result;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author at
 * @Date 2020/8/12
 **/
@Slf4j
@RestController
@RequestMapping(value = "/classify")
public class ClassifyController {

    @Autowired
    private ClassifyService classifyService;

    @GetMapping("/findAll")
    public List<Classify> findAll(){

        List<Classify> list = classifyService.findAll();
        log.info("the classifyList is {}",list);
        return list;
    }

    /**
     * 查询分类，按照父级id查询分类
     * @param parentId
     * @return
     */
    @ApiOperation(value = "查询分类，按照父级id查询分类")
    @GetMapping("/findByPersonId")
    public Result<List<Classify>> findByPersonId( @RequestParam(name = "parentId",defaultValue = "0") Integer parentId){
        log.info("the parent id is {}",parentId);
        Result<List<Classify>> result = new Result<>();

        QueryWrapper<Classify> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("parent_id",parentId);
        List<Classify> classifyList = classifyService.list(queryWrapper);
        log.info("the classifyList is{}",classifyList);
        result.success();
        result.setResult(classifyList);
        return result;
    }

    /***
     * 添加或修改分类
     * @param classify
     * @return
     */
    @ApiOperation(value = "添加或修改分类")
    @PostMapping(value = "/saveClassify")
    public Result addClassify(@RequestBody Classify classify){
        log.info("the add classify is {}",classify);
        boolean save = classifyService.saveOrUpdate(classify);
        if (save){
            return Result.ok("操作成功");
        }else return Result.error("操作失败");
    }

    /**
     * 删除分类
     * @param id
     * @return
     */
    @ApiOperation(value = "删除分类")
    @DeleteMapping(value = "/deleteClassify/{id}")
    public Result  deleteClassify(@PathVariable Integer id){
        log.info("the id is {}",id);
        QueryWrapper<Classify> queryWrapper = new QueryWrapper();
        queryWrapper.eq("parent_id",id);
        List<Classify> classifyList = classifyService.list(queryWrapper);
        log.info("the classifyList is {}",classifyList);
        if (classifyList!=null&&classifyList.size()>0){
            return Result.error("该分类下有还有子分类，删除失败");
        }
        boolean b = classifyService.removeById(id);
        if (b)
            return Result.ok("删除成功");
        else return Result.error("删除失败");

    }
}
