

import org.example.Account;
import org.example.AccoutDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {


    @Test
    public  void test2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccoutDao accountDao=context.getBean(AccoutDao.class);
        Account account=accountDao.findAccountById(1);
        System.out.println(account);
    }
    @Test
    public void test3(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccoutDao accountDao=context.getBean(AccoutDao.class);
        Account account=new Account();
        account.setUsername("sss");
        account.setBalance(123.0);
        accountDao.addNewAccount(account);
    }
    @Test
    public void test4(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccoutDao accountDao=context.getBean(AccoutDao.class);
        accountDao.transfer("lisi", "zhangsan", 100.0);
        System.out.println("转账成功！");
    }
}
