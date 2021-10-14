package com.spring;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author: zhiyang
 * @description: 用户
 * @create: 2021-10-14 17:35
 **/

@Data
public class User {

    public User() {
    }

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Value("liuchang")
    String name;

    @Value("18")
    String age;
}
