package com.date;

import com.ascp.salesplan.common.component.util.DateUtil;

import java.util.Date;

/**
 * @author: zhiyang
 * @description: 测试
 * @create: 2021-08-21 16:59
 **/


public class Date04 {
    public static void main(String[] args) {
        Date date = new Date();
        //获取这条数据对应时间下的周一的值
        Date first = DateUtil.getDayByWeekIndex(date, 1);
        //转换成 06.21 的格式
        String start = DateUtil.formatDate(first, "MM.dd");
        //获取这条数据下周日的值 并转换成 06.28 的格式
        String end = DateUtil.formatDate(DateUtil.getDayByWeekIndex(first, 7), "MM.dd");

        System.out.println(start + "~" + end);
    }
}
