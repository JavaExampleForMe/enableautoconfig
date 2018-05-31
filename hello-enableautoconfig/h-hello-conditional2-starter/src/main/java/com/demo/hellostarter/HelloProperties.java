package com.demo.hellostarter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "com.demo")
@Data
public class HelloProperties {
    private String hello;
}
