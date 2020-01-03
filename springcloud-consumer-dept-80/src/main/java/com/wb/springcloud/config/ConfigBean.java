package com.wb.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 配置类，等同于application.xml配置文件
 */
@Configuration
public class ConfigBean {

    /**
     * 使用Ribbon负载均衡
     * 基于com.netflix.loadbalancer.IRule接口的扩展
     * 具体实现有：
     *      RoundRobinRule：轮询(默认)
     *      RandomRule: 随机
     *      RetryRule: 重试，如果失败，最终会将该服务剔除
     *      ....
     *
     * 如果需要自己定义负载算法，可以实现IRule接口，或者继承AbstractLoadBalancerRule抽象类即可
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     * 修改负载均衡策略
     * @return
     */
    @Bean
    public IRule iRule() {
        //随机
        return new RandomRule();
    }

}
