package cn.fly.web.dao;

import cn.fly.web.po.Account;

import java.util.List;

/**
 * 账户dao接口
 */
public interface AccountDao {

    /**
     * 1.查询全部账户列表
     */
    List<Account> findAllAccounts();

    /**
     * 2.保存账户
     */
    void saveAccount(Account account);
}
