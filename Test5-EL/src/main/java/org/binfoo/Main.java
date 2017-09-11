package org.binfoo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by binfoo on 2017/9/8.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        ELConfig bean = context.getBean(ELConfig.class);
        bean.output();
        context.close();
    }
}