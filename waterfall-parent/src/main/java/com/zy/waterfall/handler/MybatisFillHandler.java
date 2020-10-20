package com.zy.waterfall.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author at
 * @Date 2020/8/13
 **/
@Slf4j
@Component
public class MybatisFillHandler implements MetaObjectHandler {


    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("插入填充创建人，创建时间");
        this.strictInsertFill(metaObject,"createrName",String.class,"1");
        this.strictInsertFill(metaObject,"createrTime", LocalDateTime.class,LocalDateTime.now());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("修改填充创建人，创建时间");
        this.strictInsertFill(metaObject,"createrName",String.class,"1");
        this.strictInsertFill(metaObject,"createrTime", LocalDateTime.class,LocalDateTime.now());
        this.strictInsertFill(metaObject,"updateName",String.class,"1");
        this.strictInsertFill(metaObject,"updateTime", LocalDateTime.class,LocalDateTime.now());
    }
}
