package dao;

import pojo.Account;

public interface AccountDao {
    // 通过id查询
    public Account findAccountById(int id);

    //
    public int  addAccout(Account account);


    // 转账
    public void transfer(String outUser, String inUser, Double money);

}
