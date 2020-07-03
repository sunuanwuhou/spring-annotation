package spring.java.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/3 9:00
 */
public class MyConfigPropertyBean {

    @Value("zhangsan")
    String name;
    @Value("#{20-2}")
    Integer age;
    // @Value("${person.names:nihao1}")
    @Value("${person.name}")
    String names;



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

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "MyConfigPropertyBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", names='" + names + '\'' +
                '}';
    }
}
