package com.wb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hystrix测试服务熔断主程序
 *
 * @EnableCircuitBreaker:开启Hystrix熔断机制
 *
 * 服务熔断一般在服务端
 * 服务降级一般在客户端
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class SpringApplication_Dept_Hystrix_8001 {

    public static void main(String[] args) {
        SpringApplication.run(SpringApplication_Dept_Hystrix_8001.class, args);
    }

}
