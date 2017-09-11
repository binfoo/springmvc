package org.binfoo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by binfoo on 2017/9/7.
 */

@Configuration
public class MyConfig {
    @Bean
    FunctionService functionService(){
        return new FunctionService();
    };

    @Bean
    public UserFunctionService userFunctionService(FunctionService functionService){
        UserFunctionService bean = new UserFunctionService();
        bean.setFunctionService(functionService);
        return bean;
    }

}