package com.demo.aspect;


import com.demo.service.AccountService;

public aspect CheckAspect {
    pointcut callPay(int amount, AccountService account) :
            call(boolean AccountService.pay(int)) && args(amount) && target(account);

    before(int amount, AccountService account) :
        callPay(amount, account) {
            System.out.println("aj ==> before");
    }

    after(int amount, AccountService account) :
        callPay(amount, account) {
            System.out.println("aj ==> after");
    }
}