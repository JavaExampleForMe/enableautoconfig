package com.demo.hello.main;

import com.demo.hello.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@Import({com.demo.hello.config.HelloServiceConfig.class})
public class App {

    public static void main(String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        context.getBean(HelloService.class).sayHello();
    }
}
