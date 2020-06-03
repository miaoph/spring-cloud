package com.miaoph.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
//开启监控界面功能
@EnableHystrixDashboard
public class DashBoardApplication {
    /**
     *
     * 监控url
     * http://localhost:8093/actuator/hystrix.stream
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(DashBoardApplication.class,args);
    }
}
