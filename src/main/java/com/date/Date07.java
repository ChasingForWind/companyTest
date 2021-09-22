package com.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: zhiyang
 * @description: sdf
 * @create: 2021-09-15 09:51
 **/


public class Date07 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat adf = new SimpleDateFormat("yyyyMMdd");
        System.out.println(adf.format(date));
    }
}
