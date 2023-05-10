package org.example;

import java.util.List;

public interface AccoutDao {
    // 通过id查询
    public Account findAccountById(int id);

    // 查询所有账户
    public List<Account> findAllAccount();

    //增加一个新的帐户
    public int addNewAccount(Account account);

    public void transfer(String outUser, String inUser, Double money);


}
