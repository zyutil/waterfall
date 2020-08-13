package com.zy.waterfall.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author Mht
 * @since 2020-08-13
 */

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

    private String creater_person;

    private LocalDateTime creater_time;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreater_person() {
        return creater_person;
    }

    public void setCreater_person(String creater_person) {
        this.creater_person = creater_person;
    }

    public LocalDateTime getCreater_time() {
        return creater_time;
    }

    public void setCreater_time(LocalDateTime creater_time) {
        this.creater_time = creater_time;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Tag{" +
        "id=" + id +
        ", name=" + name +
        ", creater_person=" + creater_person +
        ", creater_time=" + creater_time +
        "}";
    }
}
