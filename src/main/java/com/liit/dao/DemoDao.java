package com.liit.dao;/*
 *created by luoyanrong on 2017/12/22 19:11
 *Email:programmerSuperLuo@163.com
 *测试daata jpa
 * @Repository 标注这是一个持久化类
 */

import com.liit.pojo.Demo1;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class DemoDao {
    @Resource
    private JdbcTemplate jdbcTemplate;
    public Demo1 selectByName(String name){
        String sql="select * from demo1 where name = ? ";
        RowMapper<Demo1> rowMapper=new BeanPropertyRowMapper<>(Demo1.class);
        Demo1 demo=jdbcTemplate.queryForObject(sql,new Object[]{name},rowMapper);
        return demo;
    }
}
