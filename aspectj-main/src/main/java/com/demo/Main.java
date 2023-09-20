package com.demo;

import com.demo.service.UserService;

public class Main {
    public static void main(String[] args) {
        UserService.init();
        UserService service = new UserService();
        service.doSomething();

        UserService user = new UserService();
        user.pay(200);

        ThirdPartyService third = new ThirdPartyService();
        third.test();
    }
}