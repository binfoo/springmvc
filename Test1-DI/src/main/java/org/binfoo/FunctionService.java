package org.binfoo;

import org.springframework.stereotype.Service;

/**
 * Created by binfoo on 2017/9/7.
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "你好，" + word + "!";
    }
}