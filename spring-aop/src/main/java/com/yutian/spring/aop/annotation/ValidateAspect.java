package com.yutian.spring.aop.annotation;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect// @Aspect表示这个类是一个切面类
@Order(1)//@Order注解的value属性值越小，优先级越高
public class ValidateAspect {

    @Pointcut("execution(* com.yutian.spring.aop.annotation.CalculatorImpl.*(..))")
    public void pointCut(){}
//    @Before("com.yutian.spring.aop.annotation.LoggerAspect.poinCut()") 也行
    @Before("pointCut()")
    public void beforeMethod(){
        System.out.println("ValidateAspect---->before");
    }
}
