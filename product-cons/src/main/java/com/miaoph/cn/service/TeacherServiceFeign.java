package com.miaoph.cn.service;

import com.miaoph.cn.api.TeacherService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient//(name="eureka-order-client",fallbackFactory = )  调用方注册在eureka里面的服务名称
public interface TeacherServiceFeign extends TeacherService {
}
