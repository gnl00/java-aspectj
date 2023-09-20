package com.demo;

import com.demo.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

@EnableLoadTimeWeaving
@SpringBootApplication
public class BootMain {
    public static void main(String[] args) {
        SpringApplication.run(BootMain.class, args);
        UserService.init();
        UserService service = new UserService();
        service.doSomething();
    }
}
