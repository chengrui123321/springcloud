package com.wb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务提供者8002
 */
@SpringBootApplication
@EnableEurekaClient //将服务注册进eureka
@EnableDiscoveryClient  //服务发现
public class SpringBoot_Dept8002Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot_Dept8002Application.class, args);
    }

}
