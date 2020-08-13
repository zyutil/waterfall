package com.zy.waterfall.waterfallparent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author at
 * @Date 2020/8/12
 **/
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @GetMapping
    public String hello(){

        return "hello world";
    }

}
