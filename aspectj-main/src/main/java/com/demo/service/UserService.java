package com.demo.service;

public class UserService {

    public static void init() {
        System.out.println("static init");
    }
    public void doSomething() {
        System.out.println("user do some things");
    }

    public boolean pay(int amount) {
        System.out.println("UserService#pay(int) ==> " + amount);
        return false;
    }
}
