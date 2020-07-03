package spring.java.mainClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.java.bean.MyConfigPropertyBean;
import spring.java.config.MyConfigPropertyValues;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/3 9:01
 */
public class MyConfigPropertyValuesMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfigPropertyValues.class);

        MyConfigPropertyBean myConfigPropertyBean = (MyConfigPropertyBean)context.getBean("myConfigPropertyBean");

        System.out.println(myConfigPropertyBean);
    }
}
