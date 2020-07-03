package spring.java.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/3 9:10
 */
@Configuration
@ComponentScan({"spring.java.repository","spring.java.serrvice","spring.java.controller"})
public class MyConfigAutowired {




    // @Bean("bookRepositry2")
    // @Lazy
    // @Bean
    // public BookRepositry bookRepositry(){
    //
    //     BookRepositry bookRepositry = new BookRepositry();
    //     bookRepositry.setLable("3");
    //     return bookRepositry;
    // }
}
