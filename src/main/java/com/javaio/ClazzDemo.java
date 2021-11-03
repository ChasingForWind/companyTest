package com.javaio;

import java.io.InputStream;

/**
 * @author: zhiyang
 * @description: clazz
 * @create: 2021-10-27 10:55
 **/


public class ClazzDemo {
    public static void main(String[] args) {
        InputStream resourceAsStream = ClazzDemo.class.getResourceAsStream("/result.json");
        System.out.println(resourceAsStream);
    }
}
