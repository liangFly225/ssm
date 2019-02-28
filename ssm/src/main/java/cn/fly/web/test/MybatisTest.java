package cn.fly.web.test;

import cn.fly.web.dao.AccountDao;
import cn.fly.web.po.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;


/**
 * 测试mybatis框架独立运行
 */
public class MybatisTest {

    public static void main(String[] args) throws Exception {
        // 1.加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis/sqlMapConfig.xml");

        // 2.读取配置文件内容，获取SqlSessionFactory
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(inputStream);

        // 3.打开SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 4.获取接口代理对象
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);

        // 5.查询全部账户列表
        List<Account> list = mapper.findAllAccounts();
        for (Account a : list) {
            System.out.println(a);
        }

        // 6.释放资源
        sqlSession.close();
    }
}
