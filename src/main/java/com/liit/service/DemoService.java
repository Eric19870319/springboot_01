package com.liit.service;
/*
 *created by luoyanrong on 2017/12/22 14:11
 *Email:programmerSuperLuo@163.com
 *
 */

import com.liit.dao.DemoDao;
import com.liit.pojo.Demo1;
import com.liit.repository.DemoRepository;
import org.springframework.stereotype.Service;
import com.liit.repository.DemoRepository;
import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service
public class DemoService {
    @Resource
    private DemoRepository demoRespository;
    /**
     * save,update ,delete 方法需要绑定事务.
     *
     * 使用@Transactional进行事务的绑定.
     *
     * @param demo1
     */
    //保存数据
    @Transactional
    public void save(Demo1 demo1){
        demoRespository.save(demo1);
    }

    //删除数据
    @Transactional
    public void delete(int id){
        demoRespository.delete(id);
    }

    //查询数据
    public Iterable<Demo1> getAll(){
        return demoRespository.findAll();
    }
    //测试DemoDao
    @Resource
    private DemoDao demoDao;
    public Demo1 selectByName(String name){
        return demoDao.selectByName(name);
    }
}
