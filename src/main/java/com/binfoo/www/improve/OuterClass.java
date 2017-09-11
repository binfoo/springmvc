package com.binfoo.www.improve;

/**
 * Created by binfoo on 2017/8/29.
 */
public class OuterClass {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "OuterClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void display(){
        System.out.println("OuterClass...");
    }



    public void setAge(int age) {
        this.age = age;
    }

    public class InnerClass{

        public InnerClass(){
            name = "binfoo";
            age = 29;
        }

        public OuterClass getOuterClass(){
            return OuterClass.this;
        }

        public void display(){
            System.out.println( "OuterClass{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}');
        }

    }



    private String name;
    private int age;

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        innerClass.display();

        innerClass.getOuterClass().display();
    }

}