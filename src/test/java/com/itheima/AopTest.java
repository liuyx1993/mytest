package com.itheima;

import com.ithiema.config.Application;
import com.ithiema.entity.Account;
import com.ithiema.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
public class AopTest {

    @Autowired
    private IAccountService accountService;

    @Test
    public void test01(){

        accountService.save();

    }
}
