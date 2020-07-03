package spring.java.mainClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.java.bean.BookNot;
import spring.java.bean.Boss;
import spring.java.config.MyConfigAutowired;
import spring.java.serrvice.BookService;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/3 9:57
 */
public class AutoWiredTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfigAutowired.class);


        BookService bean = context.getBean(BookService.class);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        System.out.println(bean);




        Boss boss = context.getBean(Boss.class);

        System.out.println(boss);

        BookNot bookNot = context.getBean(BookNot.class);

        System.out.println(bookNot);

        // BookRepositry bookRepositry = context.getBean(BookRepositry.class);

        //
        // System.out.println(bookRepositry);

    }
}
