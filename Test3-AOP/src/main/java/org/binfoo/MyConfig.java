package org.binfoo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by binfoo on 2017/9/7.
 */
@Configuration
@ComponentScan("org.binfoo")
@EnableAspectJAutoProxy//开启aop代理，暴露给context
public class MyConfig {
}