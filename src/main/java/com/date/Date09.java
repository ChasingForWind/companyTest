package com.date;

import java.time.LocalDate;

/**
 * @author: zhiyang
 * @description: 测试
 * @create: 2021-10-15 00:28
 **/


public class Date09 {
    public static void main(String[] args) {
        int month = LocalDate.now().lengthOfMonth();
        int year = LocalDate.now().lengthOfYear();

        System.out.println(month);
        System.out.println(year);
    }
}
