package spring.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import spring.java.bean.MyConfigPropertyBean;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/3 8:59
 */
@PropertySource("classpath:person.properties")
@Configuration
public class MyConfigPropertyValues {

    @Bean
    public MyConfigPropertyBean myConfigPropertyBean(){
        return new MyConfigPropertyBean();
    }
}
