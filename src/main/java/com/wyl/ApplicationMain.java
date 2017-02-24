package com.wyl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication //可代替下面的三个
@Configuration//配置控制  
@EnableAutoConfiguration//启用自动配置   Spring Boot建议只有一个带有该注解的类
@ComponentScan//组件扫描  
public class ApplicationMain {
    public static void main(String[] args) throws Exception {
        //启动Spring Boot项目的唯一入口  
        SpringApplication.run(ApplicationMain.class, args);
    }
}  