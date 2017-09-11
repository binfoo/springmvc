package com.binfoo.www;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class MainApp {
    public static void main(String[] args) {

        File f = new File("");

        System.out.println(f.getAbsolutePath());
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) applicationContext.getBean("helloWorld");

        obj.setMessage("Hello World B");
        obj.getMessage();

        System.out.println("obj " + obj.hashCode());

        HelloWorld objB = (HelloWorld) applicationContext.getBean("helloWorld");

        objB.getMessage();

        System.out.println("objB "+ objB.hashCode());

//        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
//
//        HelloWorld obj2 = (HelloWorld) xmlBeanFactory.getBean("helloWorld");
//
//        obj2.getMessage();
//
//        ApplicationContext applicationContext1 = new FileSystemXmlApplicationContext("C:/Users/binfoo/IdeaProjects/springmvc/src/main/resources/Beans.xml");
//
//        HelloWorld obj1 = (HelloWorld) applicationContext1.getBean("helloWorld");
//        obj1.getMessage();

//        System.out.println(obj == obj1);
//        System.out.println(obj == obj2);
//        System.out.println(obj2 == obj1);

    }
}