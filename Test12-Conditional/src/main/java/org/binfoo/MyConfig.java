package org.binfoo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by binfoo on 2017/9/9.
 */
@Configuration
public class MyConfig {
    @Bean
    @Conditional(WindowCondition.class)
    public WindowsListService windowsListService(){
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public LinuxListService linuxListService(){
        return new LinuxListService();
    }
}