package org.binfoo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by binfoo on 2017/9/8.
 */
@Service
public class DemoService1 {
    @Value("老王")
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}