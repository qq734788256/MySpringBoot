package com.wyl.db.controller;

import com.wyl.bean.TestUser;
import com.wyl.db.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by dfsj0317 on 2017/2/24.
 */
@RestController
@RequestMapping("/db")
public class DemoController {

    @Resource
    private DemoService demoService;

    @RequestMapping("/add")
    public String add(){
        TestUser testUser = new TestUser();
        testUser.setId(1);
        testUser.setName("abc");
        demoService.save(testUser);
        return "插入成功";
    }

    @RequestMapping("/query")
    public TestUser query(long id){
        return demoService.queryById(id);
    }
}
