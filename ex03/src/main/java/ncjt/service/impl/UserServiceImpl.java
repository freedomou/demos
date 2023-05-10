package ncjt.service.impl;

import ncjt.dao.UserDao;
import ncjt.dao.impl.UserDaoImpl;
import ncjt.pojo.User;
import ncjt.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource(name = "orclDao")
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void inserUser(User user) {
        //检查一下是否有权限
        System.out.println("检查一下是否有权限");
       //调用Dao将数据写入到数据库中
        userDao.insertUser(user);
    }
}
