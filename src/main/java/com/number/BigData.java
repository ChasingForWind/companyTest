package com.number;

import java.math.BigDecimal;

/**
 * @author: zhiyang
 * @description: test
 * @create: 2021-08-18 19:39
 **/


public class BigData {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("1111111111");
        System.out.println(bigDecimal.toBigInteger().intValue());
    }
}
