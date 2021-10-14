package com.bigdecimal;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @author: zhiyang
 * @description: 千分位小数点补零
 * @create: 2021-10-11 11:08
 **/


public class Demo1 {
    final static String DOT_SEPARATOR = ".";
    public static void main(String[] args) {
        //1123.91
//        BigDecimal bigDecimal = new BigDecimal("1233.111");
//        BigDecimal value = fillZeroAndMicrometer(bigDecimal);
//        System.out.println(value.toString());

        System.out.println(fillZeroAndMicrometer(5693));


    }

    /**
     * 不足两位小数补零，保留千分位
     * @param forecastQty
     * @return
     */
    public static <T> String fillZeroAndMicrometer(T forecastQty) {
        if (forecastQty == null) {
            return null;
        }

        String num = forecastQty.toString();

        DecimalFormat df;

        if(num.contains(DOT_SEPARATOR)) {
            final int i = num.length() - num.indexOf(DOT_SEPARATOR) - 1;
            if(i == 0) {
                df = new DecimalFormat("###,##0.");
            } else if(i == 1) {
                df = new DecimalFormat("###,##0.00");
            } else {
                df = new DecimalFormat("###,##0.00");
            }
        } else {
            df = new DecimalFormat("###,##0");
        }

        return df.format(forecastQty);
    }


    /**
     * 保留两位小数且自动补零
     * @param forecastQty
     */
    public static void fillZero(BigDecimal forecastQty){
        if(forecastQty==null){
            return;
        }
        DecimalFormat df = new DecimalFormat("####.00");
        String format = df.format(forecastQty);
        System.out.println(format);
    }

}
