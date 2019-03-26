package com.ithiema.service.impl;

import com.ithiema.dao.IAccountDao;
import com.ithiema.entity.Account;
import com.ithiema.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@EnableTransactionManagement
public class AccountService implements IAccountService {

    @Autowired
    private IAccountDao accountDaoimp;

    @Override
    public void save() {
        accountDaoimp.save(new Account());

        System.out.println(1/0);

        accountDaoimp.save(new Account());
    }
}
