package ncjt.dao.impl;

import ncjt.dao.UserDao;
import ncjt.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    public void insertUser(User user) {
        System.out.println("将数据插入到mysql数据库中。。。");
    }
}
