package com.zy.waterfall;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.plugins.Page;
import com.zy.waterfall.common.entity.Article;
import com.zy.waterfall.service.IArticleService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@Slf4j
@SpringBootTest
class WaterfallParentApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private IArticleService articleService;

    @Test
    void test(){
        Page<Article> page = new Page<>(1,5);
     //  IPage<Article> page1 =  articleService.selectUserPage(page,3);
//        log.info("===============total========"+page1.getTotal());
//        log.info("===============size========"+page1.getSize());
//        log.info("===============List========\n"+page1.getRecords());


    }

}
