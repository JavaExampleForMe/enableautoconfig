package com.demo.hellostarter.config;

import com.demo.hellostarter.HelloService;
import com.demo.hellostarter.HelloServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(HelloService.class)
public class HelloServiceConfig {

    @Bean
    @Conditional(OnProdCondition.class)
    public HelloService helloService() {
        return new HelloServiceImpl();
    }
}
