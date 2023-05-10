package ncjt;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//切面类
@Aspect
@Component
public class MyAspect {
    @Pointcut("execution(* ncjt.UserDaoImpl.*())")
    public void pointone(){}

    @Before("pointone()")
    public void beginTx(){//通知
        System.out.println("开始事务");
    }

    @AfterReturning("pointone()")
    public void commitTx(){
        System.out.println("提交事务");
    }

    public void log(){
        System.out.println("日志。。。。。");
    }
}
