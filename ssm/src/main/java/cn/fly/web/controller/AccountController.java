package cn.fly.web.controller;

import cn.fly.web.po.Account;
import cn.fly.web.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * 账户controller
 */
@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 查询全部账户列表数据
     */
    @RequestMapping("/list.do")
    public ModelAndView list() {

        // 1.创建ModelAndView对象
        ModelAndView mav = new ModelAndView();

        /*// 2.响应账户列表模型数据
        List<Account> accountList = new ArrayList<Account>();

        Account a1 = new Account();
        a1.setId(1);
        a1.setName("小明");
        a1.setMoney(200f);

        Account a2 = new Account();
        a2.setId(2);
        a2.setName("小花");
        a2.setMoney(200f);

        accountList.add(a1);
        accountList.add(a2);

        mav.addObject("accountList", accountList);*/
        List<Account> accountList = accountService.findAllAccounts();
        mav.addObject("accountList",accountList);

        // 3.响应账户list视图页面
        mav.setViewName("account/list");

        return mav;
    }

    // 只要访问add.do就跳转到指定网页
    @RequestMapping("/add.do")
    public String add(){
        return "account/add";
    }

    /**
     * 保存添加账户信息（只要访问saveAccount.do就跳转到指定网页）
     */
    @RequestMapping("/saveAccount.do")
    public String saveAccount(Account account){
        // 保存账户
        accountService.saveAccount(account);

        return "redirect:list.do";
    }

}
