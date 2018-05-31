package com.demo.hellostarter.config;

import com.demo.hellostarter.HelloService;
import com.demo.hellostarter.HelloServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloServiceConfig {

    @Bean
    public HelloService helloService() {
        return new HelloServiceImpl();
    }
}
