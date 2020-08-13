package com.zy.waterfall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zy.waterfall.common.entity.Classify;

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
