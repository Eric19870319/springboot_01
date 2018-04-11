package com.liit.controller;
/*
 *created by luoyanrong on 2017/12/22 20:36
 *Email:programmerSuperLuo@163.com
 *
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/templates")
public class TemplateController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
