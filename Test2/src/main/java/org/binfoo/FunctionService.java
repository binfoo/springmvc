package org.binfoo;

import org.springframework.stereotype.Service;

/**
 * Created by binfoo on 2017/9/7.
 */
public class FunctionService {
    public String sayHello(String word){
        return "你好，" + word + "!";
    }
}