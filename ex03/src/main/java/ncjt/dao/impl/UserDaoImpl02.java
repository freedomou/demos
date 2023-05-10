package ncjt.dao.impl;

import ncjt.dao.UserDao;
import ncjt.pojo.User;
import org.springframework.stereotype.Repository;

@Repository("orclDao")
public class UserDaoImpl02 implements UserDao {
    public void insertUser(User user) {
        System.out.println("将数据插入到oracle数据库中。。。");
    }
}
