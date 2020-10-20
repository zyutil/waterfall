package com.zy.waterfall.common.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

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
@TableName("article_body")
public class ArticleBody extends Model<ArticleBody> {

    private static final long serialVersionUID=1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 文章原文
     */
    private String original;

    /**
     * 文章html
     */
    private String originalHtml;


}
