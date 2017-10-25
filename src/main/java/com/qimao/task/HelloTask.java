package com.qimao.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class HelloTask {


    @Scheduled(cron = "0/5 * * * * ? ")
    public void update(){

        System.out.println("------task-------");
    }
}
