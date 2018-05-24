package com.lyz.it.common.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author:LYZ
 * @Description:
 * @Date:Created in 17:50 2018/5/24
 * @Modified By:
 */
public class DateUtil {

    public static final String FORMAT_1 ="yyyy-MM-dd HH:mm:ss";
    public static final String FORMAT_2 ="yyyy-MM-dd ";
    public static final String FORMAT_3 ="yyyyMMdd";

    /**
     * 上个月的今天
     * @param format
     * @return
     */
    public static String prefMonthToday(String format){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH,-1);
        return dateToStr(calendar.getTime(),format);
    }

    /**
     * 加减N天
     * @param day
     * @param format
     * @return
     */
    public static String diffNDay(int day,String format){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,day);
        return dateToStr(calendar.getTime(),format);

    }

    /**
     *在指定日期上加减N天
     * @param sourDate 指定日期
     * @param format
     * @return
     */
    public static String diffNDaOnDate(Date sourDate,int day,String format){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sourDate);
        calendar.add(Calendar.DATE,day);
        return dateToStr(calendar.getTime(),format);
    }


    /**
     * 加减N月
     * @param month
     * @param format
     * @return
     */
    public static String diffNMonth(int month,String format){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH,month);
        return dateToStr(calendar.getTime(),format);
    }

    /**
     * 一周前
     * @param format
     * @return
     */
    public static String prevWeek(String format){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,-7);
        return dateToStr(calendar.getTime(),format);
    }

    /**
     * 今年第一天
     * @param format
     * @return
     */
    public static String firstDayOfYear(String format){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH,0);
        calendar.set(Calendar.DAY_OF_MONTH,1);
        return dateToStr(calendar.getTime(),format);
    }

    public static String getDateStr(String format){
        return dateToStr(new Date(),format);
    }

    /**
     * 日期转换为字符串
     * @param time
     * @param format
     * @return
     */
    private static String dateToStr(Date time, String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(time);
    }
}
