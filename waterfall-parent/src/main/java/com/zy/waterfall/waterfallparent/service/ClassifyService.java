package com.zy.waterfall.waterfallparent.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zy.waterfall.waterfallparent.common.pojo.Classify;

import java.util.List;

public interface ClassifyService extends IService<Classify> {

    List<Classify> findAll();

    /**
     * 添加分类
     * @param classify
     * @return
     */
    boolean addClassify(Classify classify);
}
