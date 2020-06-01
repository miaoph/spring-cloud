package com.miaoph.cn.service.impl;

import com.miaoph.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements UserService {
    private  String SERVER_NAME="eureka-order-client";
    @Autowired
    RestTemplate restTemplate;

    @Override
    public String queryUser() {
        System.out.println("调用开始--------》》》》》");
        final String result = restTemplate.getForObject("http://" + SERVER_NAME + "/queryUser", String.class);
        System.out.println("调用结束--------》》》》》");
        return result;
    }
}
