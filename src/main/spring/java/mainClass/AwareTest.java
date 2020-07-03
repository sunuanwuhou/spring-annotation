package spring.java.mainClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.java.bean.MyApplicationContextAware;
import spring.java.config.MyConfigAutowired;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/3 20:05
 */
public class AwareTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfigAutowired.class);

        MyApplicationContextAware bean = context.getBean(MyApplicationContextAware.class);

        System.out.println(bean);

    }
}
