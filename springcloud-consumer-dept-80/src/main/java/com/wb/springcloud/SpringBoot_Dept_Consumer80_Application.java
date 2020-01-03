package com.wb.springcloud;

import com.wb.rule.MyRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * 服务消费者主程序
 * @EnableEurekaClient：启动Eurekake客户端
 * @RibbonClient：指定使用自定义Ribbon负载均衡配置
 *      name：需要使用Ribbon负载均衡的服务
 *      configuration：自定义负载均衡配置类
 */
@SpringBootApplication
@EnableEurekaClient //开启Eureka客户端
//自定义Ribbon负载均衡需要指定自定义配置类、服务名称
@RibbonClient(name = "SPRINGCLOUD-DEPT", configuration = MyRuleConfig.class)
public class SpringBoot_Dept_Consumer80_Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot_Dept_Consumer80_Application.class, args);
    }

}
