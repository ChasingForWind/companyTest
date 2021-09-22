package com.date;

import com.ascp.salesplan.common.component.util.DateUtil;

import java.util.Date;

/**
 * @author: zhiyang
 * @description: dev
 * @create: 2021-09-02 16:08
 **/


public class Date06 {
    public static void main(String[] args) {
        String s = "20200820";
        Date date = DateUtil.parseDateByLocalDate(s, "yyyyMMdd");
        System.out.println(date);
    }
}
