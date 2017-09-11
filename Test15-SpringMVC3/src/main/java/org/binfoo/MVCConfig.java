package org.binfoo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by binfoo on 2017/9/9.
 */
@Configuration
@ComponentScan("org.binfoo")
@EnableWebMvc
public class MVCConfig extends WebMvcConfigurerAdapter{
    @Bean
    public InternalResourceViewResolver resolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/classes/views/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }

    /**
     * /**的意思是所有文件，包括文件夹中的子文件
     * /*是所有文件，不包含子文件
     * /是web项目的根目录
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        //两个*表示以/assets开始的任意层级的路径都可以访问得到图片，如<img src="../assets/img/1.png">
        //一个*表示只可以访问assets目录下的图片文件
        registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/assets/");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(myInterceptors());
    }

    @Bean
    public MyInterceptors myInterceptors(){
        return new MyInterceptors();
    }

    //快速解决页面转向问题

    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/helloworld").setViewName("/hello");
        registry.addViewController("/world").setViewName("/world");
    }
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.setUseSuffixPatternMatch(false);
    }
}