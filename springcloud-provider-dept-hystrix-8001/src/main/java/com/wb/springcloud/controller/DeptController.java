package com.wb.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wb.springcloud.entities.Dept;
import com.wb.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 服务提供者8001
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/add")
    public boolean add(Dept dept) {
       return deptService.add(dept);
    }

    @GetMapping("/get/{id}")
    @HystrixCommand(fallbackMethod = "fix") //出现方法异常执行fix方法
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = deptService.get(id);
        if (dept == null) {
            throw new RuntimeException("该Id: " + id + "没有对应的信息!");
        }
        return dept;
    }

    public Dept fix(@PathVariable("id") Long id) {
        return new Dept().setDeptno(id).setDname("该Id：" + id + "没有信息!")
                .setDb_source("No data in MySQL");
    }

    @GetMapping("/list")
    public List<Dept> list() {
        return deptService.list();
    }

}
