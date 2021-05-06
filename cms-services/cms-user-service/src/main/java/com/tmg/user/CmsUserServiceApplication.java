package com.tmg.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Administrator
 * @version 1.0
 * @className CmsUserServiceApplication
 * @description TODO
 * @date 2021/5/6 11:19
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.tmg")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.tmg")
public class CmsUserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CmsUserServiceApplication.class, args);
    }

}
