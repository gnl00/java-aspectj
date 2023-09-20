package com.demo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAspect {

    @Pointcut("execution(* com.demo.service.UserService.*(..))")
    public void pointcut() {}

    @Pointcut("execution(* org.springframework.boot.SpringApplication.*.*(..))")
    public void springPointcut() {}

    // org.mybatis.spring.SqlSessionFactoryBean.buildSqlSessionFactory
    @Pointcut("execution(* org.mybatis.spring.SqlSessionFactoryBean.buildSqlSessionFactory(..))")
    public void mybatisPointcut() {}

    @Before("pointcut()")
    public void before() {
        System.out.println("before");
    }

    // @After("mybatisPointcut()")
    public void after() {
        System.out.println("after");
    }
}
