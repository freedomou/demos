package dao;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import pojo.Users;

public interface UsersDao {
    @Select("select * from tb_user where id=#{id}")
    @Results({
            @Result(id = true,column ="id",property = "id"),
            @Result(column = "username",property ="username"),
            @Result(column = "address",property ="address"),
            @Result(column = "id",property ="ordersList",many = @Many(select = "dao.OrderDao.selectOrderByUserId"))
    })
    Users selectUsersById(int id);
}
