package com.json;

import com.alibaba.fastjson.JSON;
import org.mule.util.IOUtils;

import java.io.IOException;

/**
 * @author: zhiyang
 * @description: 依赖外部方法测试解析Json
 * @create: 2021-10-11 20:23
 **/


public class Demo1 {
    public static void main(String[] args) throws IOException {
        String text = IOUtils.getResourceAsString("./user.json", Demo1.class);
        User user = JSON.parseObject(text, User.class);
        System.out.println(user);
    }
}
