package com.miaoph.cn.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController  {

    @RequestMapping("/queryUser")
    public String queryUser() {
        log.info("========eureka-order-client===queryUser");
        return "========eureka-order-client===queryUser";
    }

    // 能否访问数据库的标识
    public static boolean canVisitDb = true;

    @RequestMapping(value = "/db/{can}", method = RequestMethod.GET)
    public void setDb(@PathVariable boolean can) {
        canVisitDb = can;
    }


}
