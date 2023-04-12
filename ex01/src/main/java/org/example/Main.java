package org.example;

import dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.HelloSpring;
import pojo.User;
import utils.MybatisUtils;

public class Main {
    public static void main(String[] args) {
//        SqlSession session = MybatisUtils.getSession();
//        UserDao userDao=session.getMapper(UserDao.class);
//        User user = userDao.findUserById(1);
//        System.out.println(user);

        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloSpring helloSpring= (HelloSpring) context.getBean("helloSpring");
        helloSpring.show();

    }
}