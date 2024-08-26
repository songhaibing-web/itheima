package com.sky.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component//实例化，自动交给bean容器管理
@Slf4j
public class Mytask {

    /**
     * 定时任务 每隔5秒触发一次
     */
//    @Scheduled(cron = "0/5 * * * * ?")
//    public void executeTask(){
//        log.info("定时任务开始执行：{}", new Date());
//    }
}
