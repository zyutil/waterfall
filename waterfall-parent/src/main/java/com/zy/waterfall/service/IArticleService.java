package com.zy.waterfall.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.plugins.Page;
import com.zy.waterfall.common.entity.Article;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Wzy
 * @since 2020-08-14
 */
public interface IArticleService extends IService<Article> {



    /**
     * 分页查询
     * @param page
     * @param article
     * @return
     */
    IPage<Article> findPage(Page<Article> page, Article article);

}
