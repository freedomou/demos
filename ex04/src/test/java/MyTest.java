import ncjt.UserDao;
import ncjt.UserDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {
    @Test
    public  void test(){
        UserDao userDao=new UserDaoImpl();
        userDao.addUser();
        userDao.delUser();
    }

    @Test
    public  void test2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao= context.getBean(UserDao.class);
        userDao.addUser();
        userDao.delUser();
    }
}
