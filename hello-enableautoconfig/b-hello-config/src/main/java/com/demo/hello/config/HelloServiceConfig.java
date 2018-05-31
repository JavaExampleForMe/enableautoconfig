package com.demo.hello.config;

import com.demo.hello.service.HelloService;
import com.demo.hello.service.HelloServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloServiceConfig {

    @Bean
    public HelloService helloService() {
        return new HelloServiceImpl();
    }
}
