package com.zy.waterfall.waterfallparent.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zy.waterfall.waterfallparent.common.pojo.Classify;
import com.zy.waterfall.waterfallparent.mapper.ClassifyMapper;
import com.zy.waterfall.waterfallparent.service.ClassifyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author at
 * @Date 2020/8/12
 **/
@Slf4j
@Service
public class ClassifyServiceImpl
        extends ServiceImpl<ClassifyMapper, Classify>
        implements ClassifyService {

    @Resource
    private ClassifyMapper classifyMapper;

    @Override
    public List<Classify> findAll() {
        List<Classify> classifies = classifyMapper.selectList(null);
        return classifies;
    }

    @Override
    public boolean addClassify(Classify classify) {

        int insert = classifyMapper.insert(classify);
        return insert>0;

    }
}
