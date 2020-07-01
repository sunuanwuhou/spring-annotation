package spring.java.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/1 17:12
 */
public class MyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        //自己的逻辑判断

        return false;
    }
}
