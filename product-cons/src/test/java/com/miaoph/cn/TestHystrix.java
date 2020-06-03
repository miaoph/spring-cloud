package com.miaoph.cn;

import com.miaoph.cn.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.databene.contiperf.PerfTest;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Rule;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 并发测试
 *
 */

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestHystrix {

    @Rule
  public ContiPerfRule contiPerfRule=  new ContiPerfRule();

    @Autowired
    UserService userService;

    /**
     * 并发测试
     */
    @Test
    @PerfTest(invocations = 11,threads = 11)//调用次数，调用线程数  并发测试
    public  void hystrixTest(){
        log.info(Thread.currentThread().getName()+"-------------"+userService.queryHystrix());
    }
}
