package com.map;

import com.google.common.collect.ImmutableSortedMap;

import java.util.Map;

/**
 * @author: zhiyang
 * @description: ImmutableSortedMap测试
 * @create: 2021-10-27 10:26
 **/


public class ImmutableSortedMapTest {
    public static void main(String[] args) {
        Map<String, String> map = ImmutableSortedMap.of("liuchang", "22", "linkaixin", "19");
        System.out.println(map);
    }
}
