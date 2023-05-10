package dao1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy implements InvocationHandler {
    private UserDao userDao;//要代理的类
    public  Object createProxy(UserDao userDao){
        this.userDao=userDao;
        return Proxy.newProxyInstance(MyProxy.class.getClassLoader(),userDao.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MyAspect myAspect=new MyAspect();
        myAspect.check_Permissions();
        Object obj=method.invoke(userDao,args);
        myAspect.log();
        return  obj;
    }
}
