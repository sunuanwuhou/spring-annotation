package spring.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import spring.java.aop.LogAspect;
import spring.java.aop.MathCalculator;

/**
 *
 * 
 * @version 1.0
 * @description
 * @date 2020/7/4 8:05
 */


@EnableAspectJAutoProxy
@Configuration
public class MyConfigAop {

    @Bean
    public MathCalculator mathCalculator(){
        return new MathCalculator();
    }

    @Bean
    public LogAspect logAspect(){
        return new LogAspect();
    }
}
