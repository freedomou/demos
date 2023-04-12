package dao;

import pojo.User;

public interface UserDao {
    /**
     *
     * @param uid 用户id
     * @return 返回一个用户对象
     */
    User findUserById(int uid);

    void insertUser(User user);
}
