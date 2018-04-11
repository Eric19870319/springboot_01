package com.liit.pojo;/*
 *created by luoyanrong on 2017/12/22 10:46
 *Email:programmerSuperLuo@163.com
 *
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;

@Getter
@Setter
@Entity
public class Demo1 {
    @Id@GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date creatTime;

}
