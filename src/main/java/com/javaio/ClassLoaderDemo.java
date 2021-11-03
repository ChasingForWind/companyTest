package com.javaio;

import java.io.InputStream;

/**
 * @author: zhiyang
 * @description: classLoaderDemo
 * @create: 2021-10-27 11:01
 **/


public class ClassLoaderDemo {
    public static void main(String[] args) {
        InputStream systemResourceAsStream = ClassLoader.getSystemResourceAsStream("result.json");
        System.out.println(systemResourceAsStream);
    }
}
