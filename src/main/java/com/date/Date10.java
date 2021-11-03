package com.date;

import java.util.Date;

/**
 * @author: zhiyang
 * @description: ceshi
 * @create: 2021-10-25 17:37
 **/


public class Date10 {
    public static void main(String[] args) {
        long along = Long.parseLong("1635151612");
        Date date = new Date(along*1000);
        System.out.println(date);
    }
}
