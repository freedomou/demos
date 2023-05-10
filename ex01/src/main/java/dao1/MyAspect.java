package dao1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Pointcut("(execution(* dao1.UserDaoImpl.*(..)))")
    public void p1(){};

    @Before("p1()")
    public void check_Permissions(){
        System.out.println("模拟检查权限...");		}
    public void log(){
        System.out.println("模拟记录日志...");		}

}
