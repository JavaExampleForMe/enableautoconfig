package com.demo.hello.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceComponentImpl implements HelloService {
    public void sayHello() {
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("------------ Ida is the king!! from HelloServiceComponentImpl with @Component -------------");
        System.out.println("-------------------------------------------------------------------------------------------");
    }

}
