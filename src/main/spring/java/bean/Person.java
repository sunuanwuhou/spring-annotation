package spring.java.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/1 10:20
 */
public class Person implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("destroy--------------");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet--------------");
    }


    @PostConstruct
    public void postConstruct(){
        System.out.println("postConstruct--------------");

    }

    @PreDestroy
    public void Predestory(){
        System.out.println("Predestory--------------");
    }


    String name;
    Integer age;

    public Person() {
        System.out.println("创建了----");
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void init(){
        System.out.println("初始----");
    }
    public void destory(){
        System.out.println("销毁----");
    }


}
