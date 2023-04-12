package ncjt.mapper;

import ncjt.pojo.Orders;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrdersMapper {

    @Select("select * from tb_orders where user_id=#{id}")
    List<Orders> selectOrdersByUserId(int userId);
}
