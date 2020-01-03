package com.wb.springcloud.controller;

import com.wb.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 基于RestTemplate的rest风格请求
 */
@RestController
@RequestMapping("/consumer/dept")
public class DeptController_Consumer {

    @Value("${rest_url_prefix}")
    private String REST_URL_PREFIX;

    private RestTemplate restTemplate;

    public DeptController_Consumer(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostMapping("/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @GetMapping("/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @GetMapping("/list")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }

}
