package org.binfoo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by binfoo on 2017/9/9.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        DemoPublish demoPublish  = context.getBean(DemoPublish.class);

        demoPublish.publish("Hello,binfoo");
        context.close();
    }
}