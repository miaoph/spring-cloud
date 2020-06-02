package com.miaoph.cn.health;

import com.miaoph.cn.controller.UserController;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MicroWebHealthIndicator implements HealthIndicator {
    /**
     * 健康状态检测，做服务平滑下线
     *  根据 配置 心跳检测
     * @return
     */
    @Override
    public Health health() {
        if(UserController.canVisitDb) {
            return new Health.Builder(Status.UP).build();
        } else {
            return new Health.Builder(Status.DOWN).build();
        }
    }
}
