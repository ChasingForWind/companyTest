package com.date;

import com.ascp.salesplan.common.component.util.DateUtil;
import com.google.common.collect.Lists;

import java.time.DayOfWeek;
import java.util.Date;
import java.util.List;

/**
 * @author: zhiyang
 * @description: 噪点
 * @create: 2021-09-23 16:52
 **/


public class Date08 {
    public static void main(String[] args) {
        Date start = DateUtil.parseDateByLocalDate("20210901", "yyyyMMdd");
        Date end = DateUtil.parseDateByLocalDate("20210902", "yyyyMMdd");
        List<Date> activityStatDayKey = getActivityStatDayKey(start, end, 1);
        for (Date d:activityStatDayKey){
            System.out.println(d.toString());
        }

    }

    private static List<Date> getActivityStatDayKey(Date start, Date end, Integer timeDimType) {

        List<Date> result = Lists.newArrayList();

        if (timeDimType.equals(TimeDimTypeEnum.DAY.getValue())) {
            int index = Math.toIntExact(DateUtil.getDiscrepantDays(start, end));
            for (int i = 0; i <= index; i++) {
                result.add(DateUtil.getDayAfterCertainDate(start, i));
            }
        } else if (timeDimType.equals(TimeDimTypeEnum.WEEK.getValue())) {
            //噪点时间段内第一个Monday
            Date startMonday = DateUtil.getDayByWeekIndex(start, DayOfWeek.MONDAY.getValue());
            //噪点时间段内最后一个Monday
            Date endMonday = DateUtil.getDayByWeekIndex(end, DayOfWeek.MONDAY.getValue());
            //中间隔了多少周
            int index = Math.toIntExact(DateUtil.getDiscrepantWeeks(startMonday, endMonday));
            for (int i = 0; i <= index; i++) {
                result.add(DateUtil.getWeekAfterCertainDate(startMonday, i));
            }
        } else {
            //噪点时间段内第一个1号
            Date firstDayOfMonth = DateUtil.getDayByMonthIndex(start, 1);
            //噪点时间段内最后一个1号
            Date lastDayOfMonth = DateUtil.getDayByMonthIndex(end, 1);
            //中间隔了多少个月
            int index = Math.toIntExact(DateUtil.getDiscrepantMonths(firstDayOfMonth, lastDayOfMonth));
            for (int i = 0; i <= index; i++) {
                result.add(DateUtil.getMonthAfterCertainDate(firstDayOfMonth, i));
            }
        }
        return result;
    }
}
