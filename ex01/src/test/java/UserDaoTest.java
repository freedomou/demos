import dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;
import utils.MybatisUtils;

public class UserDaoTest {

    @Test
    public void testInsertUser(){
        SqlSession session = MybatisUtils.getSession();
        UserDao userDao = session.getMapper(UserDao.class);

        User user=new User();
        user.setUname("线三");
        user.setUage(22);
        userDao.insertUser(user);
        session.commit();
    }
}
