package com.binfoo.www.improve;


/**
 * Created by binfoo on 2017/8/31.
 */
public class MyException extends Exception{
    public MyException(){

    }

    public MyException(String message){
        super(message);
    }
}

class Test{
    public void display(int i) throws MyException{
        if(i == 0){

            throw new MyException("不能为0");
        }else {
            System.out.println(i/2);
        }


    }

    public static void main(String[] args) {
        Test test = new Test();

        try {
            test.display(0);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }


}