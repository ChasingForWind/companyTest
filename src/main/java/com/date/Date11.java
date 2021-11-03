package com.date;

import com.ascp.salesplan.common.component.util.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: zhiyang
 * @description: 测试
 * @create: 2021-10-26 19:33
 **/


public class Date11 {
    public static void main(String[] args) {
        String s = "1635214047";
        String date = new SimpleDateFormat(DateUtil.YYYYMMDD_HHMMSS_FORMAT).format(new Date(Long.parseLong(s) * 1000));
        System.out.println(date);
    }
}
