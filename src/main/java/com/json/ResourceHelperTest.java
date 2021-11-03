package com.json;

import java.io.InputStream;

/**
 * @author: zhiyang
 * @description: 方法测试
 * @create: 2021-10-27 10:45
 **/


public class ResourceHelperTest {
    public static void main(String[] args) {
        Class<ResourceHelperTest> clazz = ResourceHelperTest.class;
        InputStream is = clazz.getResourceAsStream("/result.json");
        System.out.println(is);


        String resourceAsString = ResourceHelper.getResourceAsString(ResourceHelperTest.class, "/result.json");
        System.out.println(resourceAsString);
    }
}

