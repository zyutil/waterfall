package com.zy.waterfall.waterfallparent.common.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author at
 * @Date 2020/8/12
 **/
@Slf4j
@Data
@TableName(value = "classify")//指定表名
public class Classify {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id",type = IdType.AUTO)//指定自增策略
    private Integer id;

    private String name;

    private Integer parentId;
}
