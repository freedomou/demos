package dao;

import org.apache.ibatis.annotations.Select;
import pojo.Orders;

import java.util.List;

public interface OrderDao {
    @Select("select * from tb_orders where user_id=#{id}")
    List<Orders> selectOrderByUserId(int UserId);
}
