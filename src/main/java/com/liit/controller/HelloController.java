package com.liit.controller;/*
 *created by luoyanrong on 2017/12/22 10:35
 *Email:programmerSuperLuo@163.com
 *
 */

import com.liit.pojo.Demo1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("test")
public class HelloController {
    private static final Logger log= LoggerFactory.getLogger(HelloController.class);
    @RequestMapping("hello")
    public String hello(){
        log.error("hello world start aaa");
        return "hello world";
    }
    @RequestMapping("get2")
    public Demo1 getDemo(){
        Demo1 demo=new Demo1();
        demo.setId(1);
        demo.setName("lisi");
        demo.setCreatTime(new Date());
        return demo;
    }

}
