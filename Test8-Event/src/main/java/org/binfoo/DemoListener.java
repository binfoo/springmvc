package org.binfoo;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by binfoo on 2017/9/9.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{

    @Override
    public void onApplicationEvent(DemoEvent event) {
        System.out.println("我收到demoEvent事件了：" + event.getMsg() );

    }
}