
import ncjt.controller.UserController;
import ncjt.dao.UserDao;
import ncjt.dao.impl.UserDaoImpl;
import ncjt.pojo.User;
import ncjt.service.UserService;
import ncjt.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserControllerTest {
    @Test
    public  void testInsertUser(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext_anno.xml");
        UserController c = context.getBean(UserController.class);
        c.insertUser(null);
    }
    @Test
    public void test(){
//        UserDao userDao=new UserDaoImpl();
//        UserService userService=new UserServiceImpl();
//        ((UserServiceImpl)userService).setUserDao(userDao);
//        UserController userController=new UserController();
//        userController.setUserService(userService);
//        userController.insertUser(new User());

    }
}
