package cn.fly.web.test;

import cn.fly.web.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试spring框架独立运行
 */
public class SpringTest {

    public static void main(String[] args) {
        // 1.加载spring配置文件，创建spring容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");

        // 2.获取账户service
        AccountService service = (AccountService)context.getBean("accountService");

        // 3.查询账户列表
        service.findAllAccounts();
    }
}
