package spring.java.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/3 20:03
 */
@Component
public class MyApplicationContextAware implements ApplicationContextAware, BeanNameAware, EmbeddedValueResolverAware {

    private ApplicationContext applicationContext=null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
        System.out.println(applicationContext);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        System.out.println(resolver);
    }

    @Override
    public String toString() {
        return "MyApplicationContextAware{" +
                "applicationContext=" + applicationContext +
                '}';
    }
}
