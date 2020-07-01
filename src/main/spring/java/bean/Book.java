package spring.java.bean;

import org.springframework.stereotype.Component;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/1 11:24
 */
@Component
public class Book {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
