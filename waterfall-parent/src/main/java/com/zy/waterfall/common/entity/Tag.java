package com.zy.waterfall.common.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *  标签
 * </p>
 *
 * @author wzy
 * @since 2020-08-13
 */
@Data
@TableName("tag")
public class Tag extends Model<Tag> {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 标签名
     */
    private String name;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private String createrPerson;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime createrTime;

}
