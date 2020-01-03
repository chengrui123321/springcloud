package com.wb.rule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义负载均衡配置类
 */
@Configuration
public class MyRuleConfig {

    @Bean
    public IRule iRule() {
        return new MyRule();
    }

}
