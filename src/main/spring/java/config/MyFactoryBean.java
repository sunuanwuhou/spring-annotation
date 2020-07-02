package spring.java.config;

import org.springframework.beans.factory.FactoryBean;
import spring.java.bean.Person;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/2 10:31
 */

//spring工厂类
public class MyFactoryBean implements FactoryBean {


    @Override
    public Object getObject() throws Exception {
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
