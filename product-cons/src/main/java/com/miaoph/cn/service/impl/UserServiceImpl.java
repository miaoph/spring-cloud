package com.miaoph.cn.service.impl;

import com.miaoph.cn.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    private String SERVER_NAME = "eureka-order-client";
    @Autowired
    RestTemplate restTemplate;

    @Override
    public String queryUser() {
        System.out.println("调用开始--------》》》》》");
        final String result = restTemplate.getForObject("http://" + SERVER_NAME + "/queryUser", String.class);
        System.out.println("调用结束--------》》》》》");
        return result;
    }


    /**
     * 默认使用线程池 隔离策略
     *
     *信号量使用轻量锁，性能慢一点
     *
     * fallbackMethod   服务降级，当出现熔断，调用失败方法
     *
     * @return
     */
    @HystrixCommand(
            fallbackMethod = "queryUserFallback",
            commandKey = "queryUserContents",
            groupKey = "queryUser-one",
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.strategy", value = "THREAD"), //线程池隔离级别，默认设置线程池隔离级别
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "100000")
            },
            threadPoolKey = "queryUserHystrixPool", threadPoolProperties = {
                    @HystrixProperty(name = "coreSize",value = "5") //设置线程池大小
    })
    @Override
    public String queryHystrix() {
        log.info(Thread.currentThread().getName() + "---------");
        return "queryHystrix";
    }


    /**
     * 服务降级方法
     * @return
     */
    public String  queryUserFallback() {
        log.info("queryUserFallback----------->>>>>>>>");
        return "<<<<<<<-------queryUserFallback----------->>>>>>>>";
    }
}
