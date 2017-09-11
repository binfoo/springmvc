package com.binfoo.www.improve;


/**
 * Created by binfoo on 2017/8/29.
 */
public class User {
    private static int number = 0;
    public User(){
        number ++ ;
    }

    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();

        System.out.println(user1.number);
        System.out.println(user2.number);
    }
}