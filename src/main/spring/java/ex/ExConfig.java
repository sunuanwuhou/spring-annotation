package spring.java.ex;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @BeanPostProcessor: bean 对象初始化前后进行拦截工作
 * @BeanFactoryPostProcessor  :beanFactory后置处理器
 *
 * @description
 * @date 2020/7/6 16:42
 */
@Configuration
@Import({MyBeanDefinitionRegistryPostProcessor.class})
public class ExConfig {

}
