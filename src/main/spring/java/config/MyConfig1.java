package spring.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import spring.java.bean.Book;
import spring.java.bean.BookNot;
import spring.java.bean.Person;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/1 15:32
 */
@Configuration
// @Conditional({MyCondition.class})
@Import({BookNot.class, Book.class,MyImportSelector.class})
public class MyConfig1 {

    @Bean(name = "person")
    // @Scope("singleton")
    // @Lazy
    public Person person1(){
        return new Person("1",12);
    }

    @Bean("bill")
    // @Conditional({MyCondition.class})
    public Person person(){
        return new Person("conditional",12);
    }

}
