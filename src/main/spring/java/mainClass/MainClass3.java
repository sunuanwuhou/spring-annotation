package spring.java.mainClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.java.config.MyConfig3;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/2 11:18
 */
public class MainClass3 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig3.class);

        Object person = context.getBean("person");

        context.close();
    }
}
