package com.list;

import com.google.common.collect.ImmutableList;

/**
 * @author: zhiyang
 * @description: list测试
 * @create: 2021-10-29 17:00
 **/


public class ImmutableSortedListTest {
    public static void main(String[] args) {
        ImmutableList<Integer> list = ImmutableList.of(1, 2, 3, 4, 5);
        System.out.println(list);
    }
}
