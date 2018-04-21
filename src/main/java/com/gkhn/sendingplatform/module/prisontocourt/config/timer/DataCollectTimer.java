package com.gkhn.sendingplatform.module.prisontocourt.config.timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: Phn
 * @description:
 * @date: Created in 14:07 2018/3/1
 * @modified By:
 */
@Component
public class DataCollectTimer {

    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 10000)
    public void timerRate() {
        System.out.println(dateFormat.format(new Date()));
    }

    //第一次延迟1秒执行，当执行完后2秒再执行
    @Scheduled(initialDelay = 1000, fixedDelay = 2000)
    public void timerInit() {
        System.out.println("init : "+dateFormat.format(new Date()));
    }

    //每天20点16分50秒时执行
    @Scheduled(cron = "50 16 20 * * ?")
    public void timerCron() {
        System.out.println("current time : "+ dateFormat.format(new Date()));
    }

    /** 每隔5秒执行一次：5 * * * * ?
        每隔1分钟执行一次：0 * /1 * * * ?
        每天23点执行一次：0 0 23 * * ?
        每天凌晨1点执行一次：0 0 1 * * ?
        每月1号凌晨1点执行一次：0 0 1 1 * ?
        每月最后一天23点执行一次：0 0 23 L * ?
        每周星期天凌晨1点实行一次：0 0 1 ? * L
        在26分、29分、33分执行一次：0 26,29,33 * * * ?
        每天的0点、13点、18点、21点都执行一次：0 0 0,13,18,21 * * ? */
}
