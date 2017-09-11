package org.binfoo;

/**
 * Created by ZhangHongbin on 2017/9/8.
 */
public class BeanWayService {
    public void init(){
        System.out.println("BeanWayService-init()");
    }

    public BeanWayService(){
        System.out.println("BeanWayService-构造方法");
    }

    public void destroy(){
        System.out.println("BeanWayService-destroy()");
    }

}
