import ncjt.mapper.OrdersMapper;
import ncjt.pojo.Orders;
import ncjt.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class OrdersMapperTest {
    @Test
    public  void testselectOrdersByUserId(){
        SqlSession session = MybatisUtils.getSession();
        OrdersMapper ordersmapper = session.getMapper(OrdersMapper.class);
        List<Orders> list = ordersmapper.selectOrdersByUserId(1);
        System.out.println(list);
    }
}
