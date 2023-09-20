package com.demo;

import com.demo.service.AccountService;
import com.demo.service.UserService;

public class Main {
    public static void main(String[] args) {
        UserService.init();
        UserService service = new UserService();
        service.doSomething();

        AccountService account = new AccountService();
        account.pay(100);
    }
}