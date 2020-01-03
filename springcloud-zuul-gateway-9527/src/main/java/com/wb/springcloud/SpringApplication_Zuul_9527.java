package com.wb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Zuul网关
 */
@SpringBootApplication
@EnableZuulProxy
public class SpringApplication_Zuul_9527 {

    public static void main(String[] args) {
        SpringApplication.run(SpringApplication_Zuul_9527.class, args);
    }

}
