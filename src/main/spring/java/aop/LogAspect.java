package spring.java.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2020/7/4 8:27
 */
//告诉spring 本类是切面类
@Aspect
public class LogAspect {

    //抽取切入点公共表达式
    @Pointcut("execution(public int spring.java.aop.MathCalculator.divide(int,int))")
    public void cut() {

    }

    //前置
    @Before("cut()")
    public void logStart(JoinPoint joinPoint) {
        //获取封装了署名信息的对象,在该对象中可以获取到目标方法名,所属类的Class等信息
        Signature signature = joinPoint.getSignature();
        //获取传入目标方法的参数对象
        Object[] objects = joinPoint.getArgs();
        //获取被代理的对象
        Object target = joinPoint.getTarget();
        //获取代理对象
        Object aThis = joinPoint.getThis();

        System.out.println("logStart");
    }

    //外部类引用本类方法
    //后置
    @After("spring.java.aop.LogAspect.cut()")
    public void logEnd(JoinPoint joinPoint) {
        System.out.println("logEnd");
    }

    //返回
    @AfterReturning(value = "cut()",returning = "result")
    public void log(Object result) {
        System.out.println("log--return:"+result);
    }

    //异常
    @AfterThrowing(value = "cut()",throwing = "exception")
    public void logError(Exception exception) {
        System.out.println("logError");
    }
}
