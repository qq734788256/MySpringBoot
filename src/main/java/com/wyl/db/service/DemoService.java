package com.wyl.db.service;

import com.wyl.bean.TestUser;
import com.wyl.db.dao.DemoDao;
import com.wyl.db.dao.DemoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by dfsj0317 on 2017/2/24.
 */
@Service
public class DemoService {

    @Resource
    private DemoRepository demoRepository;
    @Resource
    private DemoDao demoDao;

    @Transactional // 事务的注解
    public void save(TestUser demo){
        demoRepository.save(demo);
    }
    public TestUser queryById(long id){
        return demoDao.getInfoById(id);
    }
}
