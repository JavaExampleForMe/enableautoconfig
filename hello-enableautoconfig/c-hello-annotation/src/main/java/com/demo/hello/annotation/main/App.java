package com.demo.hello.annotation.main;

import com.demo.hello.annotation.config.EnableHelloService;
import com.demo.hello.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@EnableHelloService
public class App {

    public static void main(String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        context.getBean(HelloService.class).sayHello();
    }
}
