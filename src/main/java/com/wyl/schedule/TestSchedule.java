package com.wyl.schedule;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by dfsj0317 on 2017/2/24.
 */
@Configuration
@EnableScheduling
public class TestSchedule {

    @Scheduled(cron = "0/1 * * * * ?")
    void schedule(){
        System.out.println("定时任务的工作内容");
    }
}
