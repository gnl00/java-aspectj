package com.demo.aspect;


import com.demo.service.UserService;

public aspect CheckAspect {
    // call 表示在代码被调用的地方织入
    pointcut callPay(int amount, UserService userService) :
            call(boolean UserService.pay(int)) && args(amount) && target(userService);

    after(int amount, UserService userService) :
            callPay(amount, userService) {
        System.out.println("CheckAspect aj ==> after");
    }
}