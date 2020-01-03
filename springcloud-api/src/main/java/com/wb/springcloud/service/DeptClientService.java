package com.wb.springcloud.service;

import com.wb.springcloud.entities.Dept;
import com.wb.springcloud.fallback.DeptFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * 基于Feign负载均衡的接口调用
 * @FeignClient: 标记这个接口是一个基于Feign负载均衡的接口
 *      value: 指定微服务名称
 *      fallbackFactory:指定服务降级的FallbackFactory
 */
@FeignClient(value = "springcloud-dept", fallbackFactory = DeptFallbackFactory.class)
public interface DeptClientService {

    @GetMapping("/dept/get/{id}")
    Dept get(@PathVariable("id") Long id);

    @GetMapping("/dept/list")
    List<Dept> list();

    @PostMapping("/dept/add")
    boolean add(Dept dept);

}
