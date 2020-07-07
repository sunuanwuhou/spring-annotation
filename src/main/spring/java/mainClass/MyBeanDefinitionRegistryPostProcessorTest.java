package spring.java.mainClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.java.ex.MyBeanDefinitionRegistryPostProcessor;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/7 20:07
 */
public class MyBeanDefinitionRegistryPostProcessorTest {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyBeanDefinitionRegistryPostProcessor.class);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
