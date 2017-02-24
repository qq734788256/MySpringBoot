package com.wyl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by dfsj0317 on 2017/2/24.
 */
@Controller
@RequestMapping("/ftl")
public class TestFreemakerController {

    @RequestMapping("/hello")
    String helloFtl(Map<String,Object> map){
        map.put("hello","TestFreemakerController.helloFtl");
        return "/helloFtl";
    }
}
