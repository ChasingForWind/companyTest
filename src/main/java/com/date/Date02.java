package com.date;

import com.ascp.salesplan.common.component.util.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author: zhiyang
 * @description: 判断日期在一个月的上旬、中旬、下旬
 * @create: 2021-08-18 09:42
 **/


public class Date02 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int day = c.get(Calendar.DATE);
        System.out.println(day);
        int days = day/10;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String format;
        switch (days){
            case 0:
                //获取上个月
                Date monthBeforeCertainDate = DateUtil.getMonthBeforeCertainDate(new Date(), 1);
                //获取上个月20号
                Date dayByMonthIndex = DateUtil.getDayByMonthIndex(monthBeforeCertainDate, 20);
                format = sdf.format(dayByMonthIndex);
                break;
            case 1:
                //获取当月10号
                Date dayByMonthIndex1 = DateUtil.getDayByMonthIndex(new Date(), 10);
                format = sdf.format(dayByMonthIndex1);
                break;
            default:
                //获取当月20号
                Date dayByMonthIndex2 = DateUtil.getDayByMonthIndex(new Date(), 20);
                format = sdf.format(dayByMonthIndex2);
                break;
        }
        System.out.println(format);
    }
}
