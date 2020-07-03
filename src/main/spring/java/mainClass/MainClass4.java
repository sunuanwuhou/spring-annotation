package spring.java.mainClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.java.config.MyBeanPostProcessor;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/2 16:18
 */
public class MainClass4 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyBeanPostProcessor.class);


    }
}
