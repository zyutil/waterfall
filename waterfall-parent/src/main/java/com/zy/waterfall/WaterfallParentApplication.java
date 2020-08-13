package com.zy.waterfall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"com.zy.waterfall.mapper"})
public class WaterfallParentApplication {

    public static void main(String[] args) {
        SpringApplication.run(WaterfallParentApplication.class, args);
    }

}
