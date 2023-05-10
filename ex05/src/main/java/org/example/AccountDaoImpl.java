package org.example;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class AccountDaoImpl implements AccoutDao{
    private  JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public Account findAccountById(int id) {//根据id得到一个帐户对象
        String sql="select * from account where id=?";
        RowMapper<Account> rowMapper=new BeanPropertyRowMapper<>(Account.class);
        return template.queryForObject(sql,rowMapper,id);
    }

    @Override
    public List<Account> findAllAccount() {
        return null;
    }

    @Override
    public int addNewAccount(Account account) {
        String sql="insert into account(username,balance)values(?,?)";
        return this.template.update(sql,account.getUsername(),account.getBalance());
    }

    @Override
    public void transfer(String outUser, String inUser, Double money) {
        // 收款时，收款用户的余额=现有余额+所汇金额
        this.template.update("update account set balance = balance +? "
                + "where username = ?",money, inUser);
        // 模拟系统运行时的突发性问题
         int i = 1/0;
        // 汇款时，汇款用户的余额=现有余额-所汇金额
        this.template.update("update account set balance = balance-? "
                + "where username = ?",money, outUser);

    }
}
