package com.demo.aspect;

public aspect MybatisAspect {
    before(): execution(* org.mybatis.spring.SqlSessionFactoryBean.buildSqlSessionFactory(..)) {
        System.out.println("MybatisAspect before ==>");
    }
}