package org.binfoo;

/**
 * Created by ZhangHongbin on 2017/9/11.
 */
public class Person {
    private String name;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(){
        super();

    }

    public Person(String name,Integer age){
        super();
        this.name = name;
        this.age = age;
    }


}
