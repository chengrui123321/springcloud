package com.wb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka服务端7002
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7002Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka7002Application.class, args);
    }

}
