package org.binfoo;

import java.lang.annotation.*;

/**
 * Created by binfoo on 2017/9/7.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}