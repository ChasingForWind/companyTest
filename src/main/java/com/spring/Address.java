package com.spring;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: zhiyang
 * @description: 地址
 * @create: 2021-10-14 17:38
 **/


@Data
@Component
public class Address {

    @Autowired
    private User user;

    String addr;
}
