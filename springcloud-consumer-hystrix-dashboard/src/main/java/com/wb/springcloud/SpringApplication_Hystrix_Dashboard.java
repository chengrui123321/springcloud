package com.wb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Hystrix Dashboard 监控服务
 */
@SpringBootApplication
@EnableHystrixDashboard
public class SpringApplication_Hystrix_Dashboard {

    public static void main(String[] args) {
        SpringApplication.run(SpringApplication_Hystrix_Dashboard.class, args);
    }

}
