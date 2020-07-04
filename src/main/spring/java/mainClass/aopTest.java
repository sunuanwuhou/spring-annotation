package spring.java.mainClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.java.aop.MathCalculator;
import spring.java.config.MyConfigAop;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/4 8:54
 */
public class aopTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfigAop.class);

        MathCalculator bean = context.getBean(MathCalculator.class);

        bean.divide(4,2);
    }
}
