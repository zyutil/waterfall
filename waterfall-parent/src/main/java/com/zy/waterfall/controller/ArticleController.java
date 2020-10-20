package com.zy.waterfall.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.plugins.Page;
import com.zy.waterfall.common.entity.Article;
import com.zy.waterfall.common.result.Result;
import com.zy.waterfall.service.IArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Wzy
 * @since 2020-08-14
 */
@Slf4j
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private IArticleService articleService;

    //添加
    @PostMapping(value = "/addArticle")
    public Result addArticle(@RequestBody Article article){
        log.info("the article is {}",article);
        try {
            boolean save = articleService.save(article);
            if (save){
                return Result.ok("添加成功");
            }else return Result.error("添加失败");
        }catch (Exception e){
            e.printStackTrace();
            return Result.error("添加失败") ;
        }

    }


    //修改

    /**
     * 修改
     * @param article
     * @return
     */
    @PutMapping(value = "/updateArticle")
    public Result updateArticle(@RequestBody Article article){
        log.info("the article is {}",article);
        try {
            boolean b = articleService.updateById(article);
            if (b){
                return Result.ok("修改成功");
            }else return Result.error("修改失败");
        }catch (Exception e){
            e.printStackTrace();
            return Result.error("修改失败") ;
        }
    }
    //查询

    /**
     * 查询所有的博文
     * @return
     */
    @GetMapping("/findAll")
    public Result<List<Article>> findAll(){
        Result<List<Article>> result = new Result<>();
        List<Article> list = articleService.list();
        result.success();
        result.setResult(list);
        return result;
    }


//    public Result<IPage<Article>> findPage(final Article article,
//                                           final @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
//                                           final @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize){
//
//
//
//
//    }
    //删除

}

