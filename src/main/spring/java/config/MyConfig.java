package spring.java.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/1 10:46
 */
@Configuration
@ComponentScan(basePackages ={"spring.java"},
includeFilters = {
        // @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class),
        // @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {BookNot.class,Person.class})},
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyFilterType.class})},
        //是否开启默认扫描 @Controller，@Service，@Repository，@Component
        useDefaultFilters = false,
excludeFilters={
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)}
        )
public class MyConfig {
    //
    // @Bean(name = "person1")
    // public Person person(){
    //     return new Person("1",12);
    // }
}
