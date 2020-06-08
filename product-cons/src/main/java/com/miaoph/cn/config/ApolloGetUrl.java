package com.miaoph.cn.config;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableApolloConfig(value = {"TEST1.springcloudurl"})
@Data
public class ApolloGetUrl {

    @Value("${test-local-apollo}")
    private String testLocalApollo;
}
