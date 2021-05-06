package com.tmg.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Administrator
 * @version 1.0
 * @className CmsGatewayApplication
 * @description TODO
 * @date 2021/5/6 13:49
 */
@SpringBootApplication
@EnableFeignClients("com.tmg")
@ComponentScan("com.tmg")
@EnableDiscoveryClient
public class CmsGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(CmsGatewayApplication.class, args);
    }
}
