import ncjt.mapper.UsersMapper;
import ncjt.pojo.Users;
import ncjt.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UsersTest {
    @Test
    public  void testselectUsersById(){
        SqlSession session = MybatisUtils.getSession();
        UsersMapper mapper = session.getMapper(UsersMapper.class);
        Users user=mapper.selectUsersById(1);
        System.out.println(user);
    }
}
