package com.liit.pojo;/*
 *created by luoyanrong on 2017/12/24 18:38
 *Email:programmerSuperLuo@163.com
 *
 */

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Getter
@Setter
@Entity
public class AAA {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String name;
    private int age;
    private Date creatTime;
}
