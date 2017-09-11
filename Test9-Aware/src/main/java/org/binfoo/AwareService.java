package org.binfoo;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by binfoo on 2017/9/9.
 */
@Service
@PropertySource(value = "t.properties",encoding = "GBK")
public class AwareService implements BeanNameAware,BeanFactoryAware,ResourceLoaderAware,EnvironmentAware{
    private String beanName;
    private ResourceLoader  resourceLoader;
    private Environment environment;
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    public void setBeanName(String s) {
        this.beanName = s;

    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;

    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;

    }
    public void output(){
        System.out.println("Bean的名称为："+ beanName);
        Resource resource = resourceLoader.getResource("t.txt");
        try {
            System.out.println(IOUtils.toString(resource.getInputStream(),"UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(environment.getProperty("binfoo.username"));
    }
}