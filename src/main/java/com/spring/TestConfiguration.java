package com.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: zhiyang
 * @description: 测试配置类
 * @create: 2021-10-14 17:33
 **/


@Configuration
public class TestConfiguration {
    @Bean
    public User getUser(){
        return new User();
    }
}
