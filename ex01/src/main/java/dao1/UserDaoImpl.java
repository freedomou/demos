package dao1;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    public void addUser() {
        System.out.println("添加用户");	}
    public void deleteUser() {
        System.out.println("删除用户");	}

}
