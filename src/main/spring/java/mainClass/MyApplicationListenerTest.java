package spring.java.mainClass;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.java.ex.MyApplicationListener;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/7 20:37
 */
public class MyApplicationListenerTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApplicationListener.class);


        context.publishEvent(new ApplicationEvent(new Integer(1)) {
        });

        context.close();
    }
}
