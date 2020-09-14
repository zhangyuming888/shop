package cn.bdqn.mapper;

import cn.bdqn.domain.Account;

import java.util.List;

public interface AccountMapper {
    //查询所有账户
    public List<Account> selectAll();
    //保存账户
    public void Insert(Account account);
}
