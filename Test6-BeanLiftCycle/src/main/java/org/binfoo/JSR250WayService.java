package org.binfoo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by ZhangHongbin on 2017/9/8.
 */
public class JSR250WayService {

    @PostConstruct
    public void init(){
        System.out.println("JSR250WayService-init()");
    }

    public JSR250WayService(){
        System.out.println("JSR250WayService()-构造方法");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("JSR250WayService-destroy()");
    }
}
