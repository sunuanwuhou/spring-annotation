package spring.java.ex;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/6 17:01
 */
public class MyBeanFactoryPsotProcessor implements BeanFactoryPostProcessor {


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        // BeanDefinition beanDefinition = beanFactory.getBeanDefinition();

        int beanDefinitionCount = beanFactory.getBeanDefinitionCount();

        System.out.println("工有多少个bean"+beanDefinitionCount);

        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        BeanDefinition exConfig = beanFactory.getBeanDefinition("person");

        System.out.println(exConfig);
    }
}
