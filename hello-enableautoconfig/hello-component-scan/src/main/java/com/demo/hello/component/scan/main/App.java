package com.demo.hello.component.scan.main;

import com.demo.hello.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.demo.hello.service")
public class App {

    public static void main(String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        context.getBean(HelloService.class).sayHello();
    }
}
