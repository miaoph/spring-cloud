package com.miaoph.cn.controller;

import com.miaoph.cn.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping("/queryUser")
    public String queryUser() {
        return userService.queryUser();
    }
}
