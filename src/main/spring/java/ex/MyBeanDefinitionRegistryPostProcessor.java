package spring.java.ex;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import spring.java.bean.Book;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/7 20:06
 */
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {


    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        //
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(Book.class).getBeanDefinition();
        registry.registerBeanDefinition("book",beanDefinition);
        System.out.println(registry.getBeanDefinitionCount());
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        System.out.println(beanFactory.getBeanDefinitionCount());
    }
}
