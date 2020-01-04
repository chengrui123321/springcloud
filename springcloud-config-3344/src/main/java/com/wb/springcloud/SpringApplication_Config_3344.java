package com.wb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心服务端
 *
 * @EnableConfigServer:标记这是一个配置中心服务端
 */
@SpringBootApplication
@EnableConfigServer
public class SpringApplication_Config_3344 {

    public static void main(String[] args) {
        SpringApplication.run(SpringApplication_Config_3344.class, args);
    }

}
