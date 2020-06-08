package com.miaoph.cn.controller;

import com.miaoph.cn.config.ApolloGetUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApolloController {
    @Autowired
    ApolloGetUrl apolloGetUrl;

    @RequestMapping("/queryApollo")
    public String queryUser() {
        return apolloGetUrl.getTestLocalApollo();
    }
}
