package org.binfoo;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Test;

import java.security.Security;

/**
 * Created by ZhangHongbin on 2017/9/20.
 */
public class Main {

//    1.首先我们需要获取SecurityManager工厂，获取的时候通过ini配置文件来初始化。
//    2.通过SecurityManager工厂获取到SecurityManager的实例，并将该实例绑定给SecurityUtils，设置给SecurityUtils是一个全局设置，设置一次即可。
//    3.从SecurityUtils中获取到一个Subject实例
//    4.通过UsernamePasswordToken对象创建用户名密码身份验证Token
//    5.调用Subject中的login方法执行登录操作，Subject会将这个登录操作自动委托给SecurityManager去执行。
//    6.在登录过程中，如果没有抛异常，说明登录成功，如果抛异常，说明登录失败
//    7.调用logout方法我们可以退出登录，退出登录的操作也是委托给SecurityManager去执行。
    @Test
    public void test1(){
        IniSecurityManagerFactory factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("zuolengchan", "456");
        try {
            subject.login(token);
            System.out.println("登录成功");
        } catch (AuthenticationException e) {
            //登录失败
            System.out.println("登录失败");
            e.printStackTrace();
        }
        subject.logout();

    }


    @Test
    public void test2(){

        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-realm.ini");

        SecurityManager securityManager = factory.getInstance();

        SecurityUtils.setSecurityManager(securityManager);

        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken("zhang","123");

        try {
            subject.login(token);
            System.out.println("登录成功");
        } catch (AuthenticationException e) {
            //登录失败
            System.out.println("登录失败");
            e.printStackTrace();
        }

        subject.logout();



    }
}
