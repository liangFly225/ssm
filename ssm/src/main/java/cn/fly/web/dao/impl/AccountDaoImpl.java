package cn.fly.web.dao.impl;

import cn.fly.web.dao.AccountDao;
import cn.fly.web.po.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户dao实现类
 */
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {

    /**
     * 1.查询全部账户列表
     */
    public List<Account> findAllAccounts() {

        System.out.println("查询全部账户列表");
        return null;
    }

    /**
     * 2.保存账户
     */
    public void saveAccount(Account account) {
        System.out.println("保存账户");
    }
}
