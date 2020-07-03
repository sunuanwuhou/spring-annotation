package spring.java.mainClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.java.config.MyConfig2;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/1 10:36
 */
public class MainClass {

    public static void main(String[] args) throws Exception {

        // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig2.class);

        //@Configuration 和 @bean 示例
        // Person person1 =(Person) context.getBean("person1");
        // System.out.println(person1);
        //
        // String[] beanNamesForType = context.getBeanNamesForType(Person.class);
        //
        // for (String arg : beanNamesForType) {
        //     System.out.println(arg);
        // }

        //获取@component扫描的组件


        //默认单例
        // Object person = context.getBean("person");
        // Object person1 = context.getBean("person");

        //获取的是getObject实例
        Object myFactoryBean = context.getBean("myFactoryBean");
        //获取的是myFactoryBean实例
        //public interface BeanFactory {
        //String FACTORY_BEAN_PREFIX = "&";
        Object myFactoryBean1 = context.getBean("&myFactoryBean");

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        //
        // System.out.println(person==person1);

    }


}
