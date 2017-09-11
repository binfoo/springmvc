package com.binfoo.www.improve.com;

/**
 * Created by binfoo on 2017/8/31.
 */
public class Test2 {
    static {
        System.out.println("執行靜態代碼塊");
    }

    {
        System.out.println("執行構造代碼塊");
    }

    public Test2(){
        System.out.println("執行無參構造函數");
    }

    public Test2(String id){
        System.out.println("執行有參構造函數");
    }

    public static void main(String[] args) {
        Test2 test1 = new Test2();
        Test2 test2 = new Test2("5");
    }
}