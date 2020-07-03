package spring.java.repository;

import org.springframework.stereotype.Repository;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/1 11:24
 */
@Repository
public class BookRepositry {

    public BookRepositry() {
        System.out.println(lable);
    }

    private String lable="1";

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    @Override
    public String toString() {
        return "BookRepositry{" +
                "lable='" + lable + '\'' +
                '}';
    }
}
