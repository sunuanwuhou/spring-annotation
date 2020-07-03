package spring.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import spring.java.bean.BookNot;
import spring.java.bean.Boss;
import spring.java.bean.MyApplicationContextAware;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/3 9:10
 */
@Configuration
@ComponentScan({"spring.java.repository","spring.java.serrvice","spring.java.controller"})
@Import({BookNot.class, MyApplicationContextAware.class})
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


    @Bean
    public Boss boss(BookNot bookNot){
        Boss boss = new Boss();
        boss.setBookNot(bookNot);
        return boss;
    }
}
