package dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import pojo.Account;

public class AccountDaoImpl implements AccountDao{
    private  JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Account findAccountById(int id) {
        String sql="select * from account where id=?";
        RowMapper<Account> rowMapper=new BeanPropertyRowMapper<>(Account.class);
        return this.jdbcTemplate.queryForObject(sql,rowMapper,id);

    }

    @Override
    public int addAccout(Account account) {
        String sql="insert into account(username,balance)values(?,?)";
        return this.jdbcTemplate.update(sql,account.getUsername(),account.getBalance());
    }

    @Override
    public void transfer(String outUser, String inUser, Double money) {
        //1.向inUser帐户存入money
        // 收款时，收款用户的余额=现有余额+所汇金额
        this.jdbcTemplate.update("update account set balance = balance +? "
                + "where username = ?",money, inUser);
        // 模拟系统运行时的突发性问题
        int i = 1/0;
        // 汇款时，汇款用户的余额=现有余额-所汇金额
        this.jdbcTemplate.update("update account set balance = balance-? "
                + "where username = ?",money, outUser);

    }
}
