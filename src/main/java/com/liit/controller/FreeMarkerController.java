package com.liit.controller;
/*
 *created by luoyanrong on 2017/12/23 13:35
 *Email:programmerSuperLuo@163.com
 *freemarker  模板引擎测试
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/ftl")
public class FreeMarkerController {
    @RequestMapping("helloFtl")
    public String hello(){
        return "helloFtl";
    }
}
