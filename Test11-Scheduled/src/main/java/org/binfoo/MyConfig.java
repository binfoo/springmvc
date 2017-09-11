package org.binfoo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by binfoo on 2017/9/9.
 */
@Configuration
@ComponentScan("org.binfoo")
@EnableScheduling
public class MyConfig {
}