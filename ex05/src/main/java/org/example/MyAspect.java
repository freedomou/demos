package org.example;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//切面类
@Aspect
@Component
public class MyAspect {
    @Pointcut("execution(* org.example.UserDaoImpl.addUser())")
    public void point1(){
    }
    @Before("point1()")
    public void beginTx(){//通知
        System.out.println("开始事务");
    }
    @After("point1()")
    public void commitTx(){
        System.out.println("提交事务");
    }
}
