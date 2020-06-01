package com.miaoph.cn.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {

    @RequestMapping("/queryUser")
    public String queryUser() {
        log.info("========eureka-order-client===queryUser");
        return "========eureka-order-client===queryUser";
    }
}
