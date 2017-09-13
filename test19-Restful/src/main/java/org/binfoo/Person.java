package org.binfoo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by ZhangHongbin on 2017/9/13.
 */
@Entity
public class Person {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private Integer age;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String address;


    public Person(){

    }
    public Person(long id,String name,Integer age,String address){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }


}
