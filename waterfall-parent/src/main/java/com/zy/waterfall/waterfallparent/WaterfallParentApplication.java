package com.zy.waterfall.waterfallparent;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan(value = {"com.zy.waterfall.waterfallparent.mapper"})
public class WaterfallParentApplication {

    public static void main(String[] args) {
        SpringApplication.run(WaterfallParentApplication.class, args);
    }

}
