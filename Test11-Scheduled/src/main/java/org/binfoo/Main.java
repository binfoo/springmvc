package org.binfoo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by binfoo on 2017/9/9.
 */
public class Main {
    private static final SimpleDateFormat FORMAT = new SimpleDateFormat("HH:mm:ss");
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        ScheduledTaskService scheduledTaskService = context.getBean(ScheduledTaskService.class);
        System.out.println("当前时间：" +  FORMAT.format(new Date()));
    }
}