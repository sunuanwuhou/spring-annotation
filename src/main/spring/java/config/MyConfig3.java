package spring.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.java.bean.Person;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/2 11:17
 */
@Configuration
public class MyConfig3 {

    @Bean(initMethod = "init",destroyMethod = "destory")
    public Person person() {
        return new Person("1",1);
    }

}
