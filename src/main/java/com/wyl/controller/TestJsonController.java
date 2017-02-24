package com.wyl.controller;

import com.wyl.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * Created by dfsj0317 on 2017/2/24.
 * 测试返回json
 * 当注解为RestController时，ReponseBody可不写，返回一个对象默认会转化为一个json串 （Jackson进行转换）
 *
 */
@RestController
@RequestMapping("/json")
public class TestJsonController {
    @RequestMapping("/info")
    User getUserInfo(){
        User user = new User();
        user.setId(1);
        user.setName("我就是一个测试的姓名");
        user.setAge(25);
        return user;
    }
}
