package org.binfoo;

import org.springframework.stereotype.Service;

/**
 * Created by binfoo on 2017/9/7.
 */
@Service
public class MethodService {
    public void add(){
        System.out.println("method-add()");
    }
}