package org.binfoo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by binfoo on 2017/9/7.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UserFunctionService bean = context.getBean(UserFunctionService.class);

        System.out.println(bean.sayHello("binfoo"));

        context.close();



    }
}