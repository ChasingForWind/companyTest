package com.json;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.ArrayList;

/**
 * @author: zhiyang
 * @description: 测试
 * @create: 2021-10-20 21:00
 **/


public class Demo4 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        User user = new User();

        for (int i = 0; i < 100; i++) {
            users.add(user);
        }

        System.out.println(JSONObject.toJSONString(users, SerializerFeature.DisableCircularReferenceDetect));
    }
}
