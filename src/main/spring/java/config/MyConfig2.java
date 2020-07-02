package spring.java.config;

import org.springframework.context.annotation.Bean;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/2 10:33
 */
public class MyConfig2 {

    @Bean
    public MyFactoryBean myFactoryBean(){
        return new MyFactoryBean();
    }
}
