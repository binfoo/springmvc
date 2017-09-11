package com.binfoo.www.improve;

/**
 * Created by binfoo on 2017/8/30.
 */
public class InnerClass3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println(array.getClass().getName());
        System.out.println(array.getClass().getSuperclass());
    }
}