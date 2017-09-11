package org.binfoo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by binfoo on 2017/9/9.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService service = context.getBean(AsyncTaskService.class);
        System.out.println(Thread.currentThread().getName());
        for(int i=0; i<100;i++){
            service.executeAsyncTask(i);
            service.executeAsyncTask2(i);
        }
        context.close();
    }
}