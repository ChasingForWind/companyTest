package com.fund;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhiyang
 * @description: 测试空字符串判断
 * @create: 2021-10-08 19:29
 **/


public class StringTest {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add(new String(""));
        System.out.println(a.isEmpty());
        System.out.println(a.get(0).isEmpty());
    }
}
