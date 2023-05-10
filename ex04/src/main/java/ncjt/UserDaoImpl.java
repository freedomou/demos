package ncjt;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//目标类
@Repository
public class UserDaoImpl implements UserDao{
    public void addUser() {
        System.out.println("add....user");
    }

    public void delUser() {
        System.out.println("del.....user");
    }
}
