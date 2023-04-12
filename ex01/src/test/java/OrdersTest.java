import dao.OrderDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Orders;
import pojo.Product;
import utils.MybatisUtils;

import java.util.List;

public class OrdersTest {
    @Test
    public  void testp(){
        SqlSession session = MybatisUtils.getSession();
        List<Product> ls = session.selectList("mapper.ProductMapper.findProductsByOid", 1);
        System.out.println(ls);
    }
    @Test
    public void testo(){
        SqlSession session = MybatisUtils.getSession();
        Orders orders=session.selectOne("mapper.OrdersMapper.findOrdersAndProductByOid",1);
        System.out.println(orders);
    }
    @Test
    public void testselectOrderByUserId(){
        SqlSession session = MybatisUtils.getSession();
        OrderDao orderDao = session.getMapper(OrderDao.class);
        List<Orders> orders = orderDao.selectOrderByUserId(1);
        System.out.println(orders);
        session.close();
    }
}
