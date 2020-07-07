package spring.java.mainClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.java.ex.ExConfig;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/6 17:01
 */
public class MyBeanFactoryPsotProcessorTest {


    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ExConfig.class);
    }

}
