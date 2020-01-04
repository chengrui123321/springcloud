package com.wb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringApplication_Config_Eureka_Client_7001 {

    public static void main(String[] args) {
        SpringApplication.run(SpringApplication_Config_Eureka_Client_7001.class, args);
    }
}
