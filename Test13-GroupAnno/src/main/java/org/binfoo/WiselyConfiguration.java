package org.binfoo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by binfoo on 2017/9/9.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
@ComponentScan
public @interface WiselyConfiguration {
    String[] value();
}