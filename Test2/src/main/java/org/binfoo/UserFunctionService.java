package org.binfoo;

/**
 * Created by binfoo on 2017/9/7.
 */
public class UserFunctionService {
    FunctionService functionService;
    public void setFunctionService(FunctionService functionService){
        this.functionService= functionService;
    }

    public String sayHello(String word){
        return functionService.sayHello(word);
    }

}