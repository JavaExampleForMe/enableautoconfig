package com.demo.hellouser;

import com.demo.hellostarter.HelloService;
import com.demo.hellostarter.HelloServiceImpl;
import com.demo.hellostarter.config.HelloServiceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration()
public class App {

//    @Bean
//    public HelloService helloService() {
//        return new HelloServiceImpl2();
//    }

    public static void main(String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        context.getBean(HelloService.class).sayHello();
    }
}
