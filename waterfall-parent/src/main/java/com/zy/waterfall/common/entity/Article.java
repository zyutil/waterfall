package com.zy.waterfall.common.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author Wzy
 * @since 2020-08-14
 */
@Data
@TableName("article")
public class Article extends Model<Article> {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 文章简介
     */
    private String synopsis;

    /**
     * 文章图片
     */
    private String headerImage;

    /**
     * 文章分类
     */
    private Integer categoryId;

    /**
     * 文章标签
     */
    private String tagIds;

    /**
     * 评论条数
     */
    private Integer commentCount;

    /**
     * 点赞数量
     */
    private Integer likeCount;

    /**
     * 文章类型 101原创，102转载，103,翻译
     */
    private Integer articleType;

    /**
     * 文章主体id
     */
    private Integer bodyId;

    /**
     * 创建人
     */
    @TableField(fill = FieldFill.INSERT)
    private String createrName;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createrTime;

    /**
     * 是否删除 1: true ,0: false
     */
    private Integer if_delete;

    /**
     * 删除时间
     */
    private LocalDateTime deleteTime;

    /**
     * 删除人
     */
    private String deleteName;

    /**
     * 修改人
     */
    @TableField(fill = FieldFill.UPDATE)
    private String updateName;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;


}
