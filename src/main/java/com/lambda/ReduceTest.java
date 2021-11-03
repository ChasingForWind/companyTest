package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: zhiyang
 * @description: 测试reduce
 * @create: 2021-10-27 09:48
 **/


public class ReduceTest {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        Integer reduce = integers.stream().reduce(1, Integer::sum);

        System.out.println(reduce);
    }
}
