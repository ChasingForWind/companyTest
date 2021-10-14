package com.date;

import com.ascp.salesplan.common.component.util.DateUtil;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author: zhiyang
 * @description: 去年
 * @create: 2021-10-14 11:11
 **/


public class DateYear {
    public static void main(String[] args) {
        Date date = new Date();


        //方法一
        Date yearBeforeCertainDate_1 = DateUtil.getMonthBeforeCertainDate(date, 12);

        //方法二
        LocalDate localDate = DateUtil.dateToLocalDate(date);
        LocalDate lsy = localDate.minusYears(1);
        Date yearBeforeCertainDate_2 = DateUtil.localDateToDate(lsy);

    }
}
