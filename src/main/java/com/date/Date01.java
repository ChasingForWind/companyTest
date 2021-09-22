package com.date;

import com.ascp.salesplan.common.component.util.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(today);

        Calendar cal = Calendar.getInstance();
        cal.set(2021,10,1);
        Date date = cal.getTime();
        System.out.println(date);

        long firstWeek = 0;
        long lastWeek = 0;

        //获取当前时间下周一的值
        Date currentMonday = DateUtil.getDayByWeekIndex(date, 1);

        long a = DateUtil.getDiscrepantWeeks(today, currentMonday);
        long b = DateUtil.getDiscrepantWeeks(currentMonday, today);
        System.out.println(a);
        System.out.println(b);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date currentMonday2 = DateUtil.getDayByWeekIndex(new Date(), 1);
        Date firstWeekMonday = DateUtil.getWeekBeforeCertainDate(currentMonday2, 12);
        Date lastWeekMonday = DateUtil.getWeekAfterCertainDate(currentMonday2, 13);
        System.out.println(sdf.format(firstWeekMonday));
        System.out.println(sdf.format(lastWeekMonday));


    }
}
