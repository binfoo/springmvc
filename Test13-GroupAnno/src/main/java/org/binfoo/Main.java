package org.binfoo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by binfoo on 2017/9/9.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        DemoBean bean = context.getBean(DemoBean.class);
        bean.output();
        context.close();
    }
}