package com.binfoo.www.improve;

public class OuterClass2 {
    public InnerClass getInnerClass(final int   num,String str2){
        return new InnerClass(){
            int number = num + 3;
            public int getNumber(){
                return number;
            }
        };        /* 注意：分号不能省 */
    }

    public static void main(String[] args) {
        OuterClass2 out = new OuterClass2();
        InnerClass inner = out.getInnerClass(2, "chenssy");
        System.out.println(inner.getNumber());
    }
}

interface InnerClass {
    int getNumber();
}
