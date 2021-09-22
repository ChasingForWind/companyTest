package com.date;

import com.ascp.salesplan.common.component.util.DateUtil;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: zhiyang
 * @description: 过去六个月预测
 * @create: 2021-08-18 10:54
 **/


public class Date03 {
    private List<LabelVO> buildDataversionList() {
        List<LabelVO> result = new ArrayList<>();
        //获取过去6个月数据版本的字符串
        List<String> lastSixMonthList = buildLastSixMonthStringList();
        //数据组装
        lastSixMonthList.forEach(version->{
            result.add(new LabelVO(version,version));
        });
        return result;
    }

    private List<String> buildLastSixMonthStringList() {
        List<Date> dateList = new ArrayList<>();
        Date recentVersion = getRecentVersion();
        dateList.add(recentVersion);
        //判断是否是当前月的20号，如果是当月20号，则还需要添加当月10号
        if (DateUtil.getDayByMonthIndex(recentVersion,20).equals(recentVersion)) {
            dateList.add(DateUtil.getDayByMonthIndex(recentVersion,10));
        }
        //获取过去6个月的版本日期
        for (int i = 1; i <=6 ; i++) {
            Date monthBeforeCertainDate = DateUtil.getMonthBeforeCertainDate(recentVersion, i);
            //上个月20号
            Date month20 = DateUtil.getDayByMonthIndex(monthBeforeCertainDate, 20);
            //上个月10号
            Date month10 = DateUtil.getDayByMonthIndex(monthBeforeCertainDate, 10);
            //添加
            dateList.add(month20);
            dateList.add(month10);
        }
        //将版本日期转换成字符串
        return dateList.stream()
                .map(date -> DateUtil.formatDate(date, DateUtil.YYYYMMDD_NOSTRIKE_FORMAT))
                .collect(Collectors.toList());
    }

    private Date getRecentVersion() {
        Calendar c = Calendar.getInstance();
        int day = c.get(Calendar.DATE);
        int days = day/10;
        Date date;
        switch (days){
            case 0:
                //获取上个月
                Date monthBeforeCertainDate = DateUtil.getMonthBeforeCertainDate(new Date(), 1);
                //获取上个月20号
                date = DateUtil.getDayByMonthIndex(monthBeforeCertainDate, 20);
                break;
            case 1:
                //获取当月10号
                date = DateUtil.getDayByMonthIndex(new Date(), 10);
                break;
            default:
                //获取当月20号
                date = DateUtil.getDayByMonthIndex(new Date(), 20);
                break;
        }
        return date;
    }

    public static void main(String[] args) {
        Date03 date03 = new Date03();
        List<LabelVO> labelVOS = date03.buildDataversionList();
        System.out.println(labelVOS);
    }
}
