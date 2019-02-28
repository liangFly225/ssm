package cn.fly.web.service.impl;

import cn.fly.web.dao.AccountDao;
import cn.fly.web.po.Account;
import cn.fly.web.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账户service实现类
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    // 定义账户dao'
    @Autowired
    private AccountDao accountDao;

    /**
     * 1.查询全部账户列表
     */
    public List<Account> findAllAccounts() {
        return accountDao.findAllAccounts();
    }

    /**
     * 2.保存账户
     *
     */
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }
}
