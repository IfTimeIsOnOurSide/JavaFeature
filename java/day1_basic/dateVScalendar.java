package day1_basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Description: 日期
 * @author: daimin
 * @date: Create in 20:50 2019/2/23
 */
public class dateVScalendar {
    public static void main(String[] args) {
//        dateFormat();
        calendarInstance();
    }

    /**
      *   Date对象及SimpleDateFormat格式化
     */
    public static void  dateFormat () {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(new Date() + "\n  format :" + dateFormat.format(date));
    }

    /**
    * Calendar 抽象类  getInstance
     */
    public static void calendarInstance() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2019, 02, 23);
        System.out.println("year: " + calendar.get(Calendar.YEAR) + " month: " + calendar.get(Calendar.MONTH ));
    }
}
