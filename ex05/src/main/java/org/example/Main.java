package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccoutDao accountDao=context.getBean(AccoutDao.class);
        accountDao.transfer("lisi", "zhangsan", 100.0);
        System.out.println("转账成功！");
    }
}
