package com.generic;

import org.checkerframework.checker.units.qual.A;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * @author: zhiyang
 * @description: 继承
 * @create: 2021-10-27 20:43
 **/


public class Extension {
    public static void main(String[] args) {
        ArrayList<? super Food> arrays = new ArrayList<>();

        arrays.add(new Apple());

        System.out.println(arrays);

    }
}
