import cn.bdqn.domain.Account;
import cn.bdqn.mapper.AccountMapper;
import cn.bdqn.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class AccountTest {
    @Test
    public void testMapper() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);

        SqlSession session = ssf.openSession();

        AccountMapper accountMapper = session.getMapper(AccountMapper.class);
        List<Account> accounts = accountMapper.selectAll();
        System.out.println(accounts);

        is.close();
        session.close();
    }
    @Test
    public void testService(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");

        AccountService accountService = (AccountService) ac.getBean("accountService");

        System.out.println(accountService);
    }
    @Test
    public void testMaaper(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");

        AccountService accountService = (AccountService) ac.getBean("accountService");
        List<Account> accounts = accountService.queryAll();

        System.out.println(accounts);
    }
}
