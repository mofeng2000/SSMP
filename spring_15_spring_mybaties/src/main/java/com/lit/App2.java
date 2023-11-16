package com.lit;

import com.lit.config.SpringConfig;
import com.lit.domain.Account;
import com.lit.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService bean = context.getBean(AccountService.class);
        Account byId = bean.findById(2);
        System.out.println(byId);
    }
}
