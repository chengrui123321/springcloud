package com.wb.springcloud.controller;

import com.netflix.discovery.converters.Auto;
import com.wb.springcloud.entities.Dept;
import com.wb.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Feign负载均衡Controller
 */
@RestController
public class DeptConsumerFeignController {

    @Autowired
    private DeptClientService deptClientService;

    @PostMapping("/add")
    public boolean add(Dept dept) {
        return deptClientService.add(dept);
    }

    @GetMapping("/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptClientService.get(id);
    }

    @GetMapping("/list")
    public List<Dept> list() {
        return deptClientService.list();
    }

}
