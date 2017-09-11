package com.binfoo.www.improve;

/**
 * Created by binfoo on 2017/8/30.
 */
public class OutClass3 {
    public InnerClass3 getInnerClass(final int age,final String name){
        return new InnerClass3() {
            int age_;
            String name_;
            {
                if(0 < age && age<200){
                    age_ = age;
                    name_=name;
                }
            }

            public String getName(){
                return name_;
            }
            public int getAge(){
                return age_;
            }

        };
    }

    public static void main(String[] args) {
        OutClass3 out = new OutClass3();

        InnerClass3 inner_1 = out.getInnerClass(201, "chenssy");

        InnerClass3 inner_2 = out.getInnerClass(23, "chenssy");
    }
}