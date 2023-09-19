package com.demo;

import com.demo.service.UserService;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();
        service.doSomething();
    }
}