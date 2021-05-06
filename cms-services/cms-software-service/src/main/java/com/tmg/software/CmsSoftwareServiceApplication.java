package com.tmg.software;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

import javax.sql.DataSource;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = "com.tmg")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.tmg")
public class CmsSoftwareServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmsSoftwareServiceApplication.class, args);
    }

}
