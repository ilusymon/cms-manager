package com.tmg.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.tmg")
public class CmsAuthServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmsAuthServiceApplication.class, args);
    }

}
