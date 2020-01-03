package com.wb.springcloud.fallback;

import com.wb.springcloud.entities.Dept;
import com.wb.springcloud.service.DeptClientService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * 自定义针对DeptClientService所有的方法的服务降级
 * 需要实现FallbackFactory接口。
 * 指定泛型为需要降级的接口
 * 需要将该组件加入容器中
 */
@Component
public class DeptFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(Long id) {
                return new Dept()
                        .setDeptno(id)
                        .setDname("服务降级[id: " + id + "对应的信息不存在!]")
                        .setDb_source("No DataSource Exists!");
            }

            @Override
            public List<Dept> list() {
                return Arrays.asList(new Dept()
                .setDeptno((long) -1)
                .setDname("no list")
                .setDb_source("no data"));
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
