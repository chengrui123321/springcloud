package com.wb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka服务端7001
 */
@SpringBootApplication
@EnableEurekaServer //开启Eureka服务端
public class Eureka7001Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka7001Application.class, args);
    }

}
