package ncjt.example;

import dao1.MyProxy;
import dao1.UserDao;
import dao1.UserDaoImpl;
import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.HelloSpring;
import pojo.User;
import utils.MybatisUtils;

public class Main {
    public static void main(String[] args) {
//        MyProxy myProxy=new MyProxy();
//        UserDao userDao=new UserDaoImpl();
//        UserDao userDao1= (UserDao) myProxy.createProxy(userDao);
//        userDao1.addUser();



//        SqlSession session = MybatisUtils.getSession();
//        UserDao userDao=session.getMapper(UserDao.class);
//        User user = userDao.findUserById(1);
//        System.out.println(user);

//        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//        HelloSpring helloSpring= (HelloSpring) context.getBean("helloSpring");
//        helloSpring.show();
//        HelloSpring helloSpring2= (HelloSpring) context.getBean("helloSpring2");
//        helloSpring2.show();

        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = context.getBean(UserDao.class);
        userDao.addUser();
        userDao.deleteUser();

    }
}