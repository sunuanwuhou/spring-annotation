package spring.java.ex;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/7 20:32
 */
public class MyApplicationListener implements ApplicationListener {

    //容器中发布事件后 触发事件
    @Override
    public void onApplicationEvent(ApplicationEvent event) {

        System.out.println("事件"+event);
    }
}
