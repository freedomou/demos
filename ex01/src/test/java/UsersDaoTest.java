import dao.UsersDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Users;
import utils.MybatisUtils;

public class UsersDaoTest {
    @Test
    public void test1(){
        SqlSession session = MybatisUtils.getSession();
        UsersDao usersDao=session.getMapper(UsersDao.class);
        Users users=usersDao.selectUsersById(1);
        System.out.println(users);
        session.close();
    }
}
