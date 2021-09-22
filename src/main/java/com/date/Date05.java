package com.date;

import com.ascp.salesplan.common.component.util.DateUtil;

import java.util.Date;

/**
 * @author: zhiyang
 * @description: ceshi
 * @create: 2021-08-31 15:23
 **/


public class Date05 {
    public static void main(String[] args) {
        System.out.println(DateUtil.getMonthBeforeCertainDate(DateUtil.getDayByMonthIndex(new Date(), 20), 1));
    }
}
