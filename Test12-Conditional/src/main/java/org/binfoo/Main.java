package org.binfoo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by binfoo on 2017/9/9.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(listService.showListCmd());
        context.close();
    }
}