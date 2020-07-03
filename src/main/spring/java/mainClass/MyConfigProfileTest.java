package spring.java.mainClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.java.bean.MyConfigProfile;

import javax.sql.DataSource;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/3 21:49
 */
public class MyConfigProfileTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //这里不能使用有参构造
        //设置环境
        context.getEnvironment().setActiveProfiles("dev","test");
        context.register(MyConfigProfile.class);
        context.refresh();

        String[] beanNamesForType = context.getBeanNamesForType(DataSource.class);

        for (String s : beanNamesForType) {
            System.out.println(s);
        }

    }
}
