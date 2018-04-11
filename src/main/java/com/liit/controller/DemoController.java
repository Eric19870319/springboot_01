package com.liit.controller;/*
 *created by luoyanrong on 2017/12/22 14:22
 *Email:programmerSuperLuo@163.com
 *
 */

import com.liit.pojo.Demo1;
import com.liit.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping("demo")
public class DemoController {
    @Resource
    private DemoService demoService;
    @RequestMapping("save")
    public String save(){
        Demo1 demo=new Demo1();
        demo.setName("zhangsan");
        demo.setId(2);
        demo.setCreatTime(new Date());
        Demo1 demo1=new Demo1();
        demo1.setName("张三");
        demo1.setId(3);
        demo1.setCreatTime(new Date());
        Demo1 demo2=new Demo1();
        demo2.setName("李四");
        demo2.setId(4);
        demo2.setCreatTime(new Date());
        demoService.save(demo);
        demoService.save(demo1);
        demoService.save(demo2);
        return "保存成功";
    }
    @RequestMapping("delete")
    public String delete(){
        demoService.delete(1);
        return "删除成功";
    }
    @RequestMapping("getAll")
    public Iterable<Demo1> getAll(){
        return demoService.getAll();
    }

    @RequestMapping("select")
    public Demo1 select(String name){
        return demoService.selectByName(name);
    }
}
