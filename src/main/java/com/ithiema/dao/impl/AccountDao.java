package com.ithiema.dao.impl;

import com.ithiema.dao.IAccountDao;
import com.ithiema.entity.Account;
import com.ithiema.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class AccountDao implements IAccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(Account account) {
        jdbcTemplate.update("insert into account values (null,?,?)",
                account.getUid(),account.getMoney());
    }
}
