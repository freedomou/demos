import dao.AccountDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Account;

public class AccountDaoTest {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao=context.getBean(AccountDao.class);
        Account a = accountDao.findAccountById(1);
        System.out.println(a);
    }
    @Test
    public void test1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao=context.getBean(AccountDao.class);
        Account account=new Account();
        account.setUsername("王老五");
        account.setBalance(10000.0);
        int n=accountDao.addAccout(account);
        System.out.println(n);

    }
    @Test
    public void test2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao=context.getBean(AccountDao.class);
        accountDao.transfer("lisi","wangwu",100.0);
    }
}
