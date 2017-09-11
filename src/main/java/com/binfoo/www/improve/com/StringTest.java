package com.binfoo.www.improve.com;

/**
 * Created by binfoo on 2017/8/31.
 */
public class StringTest {
    public static void main(String[] args) {
        long start_01 = System.currentTimeMillis();
        String a = "a";
        for(int i = 0; i< 100000;i++){
            a += "b";
        }

        long stop_01 = System.currentTimeMillis();
        System.out.println("+所消耗時間為" + (stop_01 - start_01) + "ms");

        long start_02 = System.currentTimeMillis();
        String c = "c";
        for(int i = 0 ; i < 100000 ; i++){
            c = c.concat("d");
        }
        long end_02 = System.currentTimeMillis();
        System.out.println("concat所消耗的时间：" + (end_02 - start_02) + "毫米");

        //append
        long start_03 = System.currentTimeMillis();
        StringBuffer e = new StringBuffer("e");
        for(int i = 0 ; i < 100000 ; i++){
            e.append("d");
        }
        long end_03 = System.currentTimeMillis();
        System.out.println("append所消耗的时间：" + (end_03 - start_03) + "毫米");
    }
}