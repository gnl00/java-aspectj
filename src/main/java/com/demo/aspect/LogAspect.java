package com.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAspect {

    @Pointcut("execution(* com.demo.service.UserService.doSomething(..))")
    public void pointcut() {}

    @Before("pointcut()")
    public void before() {
        System.out.println("before");
    }
}
