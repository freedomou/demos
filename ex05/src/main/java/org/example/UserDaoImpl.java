package org.example;

import org.springframework.stereotype.Component;

//目标类
@Component("userDao")
public class UserDaoImpl implements UserDao {
    public void addUser() {
        System.out.println("add....user");
    }

    public void delUser() {
        System.out.println("del.....user");
    }
}
