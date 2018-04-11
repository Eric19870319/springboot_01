package com.liit.repository;
/*
 *created by luoyanrong on 2017/12/22 14:04
 *Email:programmerSuperLuo@163.com
 *类操作持久化类
 */

import com.liit.pojo.Demo1;
import org.springframework.data.repository.CrudRepository;

public interface DemoRepository extends CrudRepository<Demo1,Integer>{

}
