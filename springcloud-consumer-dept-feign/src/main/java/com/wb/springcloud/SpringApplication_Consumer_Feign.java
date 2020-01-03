package com.wb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 基于Feign负载均衡主程序(默认时使用Ribbon轮询负载策略)
 * @EnableFeignClients:指定Feign接口所在的包
 */
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.wb.springcloud"})
@EnableEurekaClient
public class SpringApplication_Consumer_Feign {

    public static void main(String[] args) {
        SpringApplication.run(SpringApplication_Consumer_Feign.class, args);
    }

}
