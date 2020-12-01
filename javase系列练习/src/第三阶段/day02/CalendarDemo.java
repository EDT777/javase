package 第三阶段.day02;

import java.util.Calendar;
import java.util.Date;

//需求：创建Calendar对象，并分别设置和获取日期的年、月、日、时、分、秒。
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c =Calendar.getInstance();
        int year =c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int day  =c.get(Calendar.DAY_OF_MONTH);
        int hour =c.get(Calendar.HOUR_OF_DAY);
        int min = c.get(Calendar.MINUTE);
        int s = c.get(Calendar.SECOND);
        System.out.println("现在是"+year+"年"+month+"月"+day+"日"+hour+"时"+min+"分"+s+"秒");
        c.add(Calendar.YEAR,1);
        System.out.println(c.get(Calendar.YEAR));

        System.out.println("===========");
        Date d1 = new Date();
        System.out.println(d1.toLocaleString());
        c.setTime(d1);
        c.set(Calendar.YEAR,2000);
        c.set(Calendar.DAY_OF_MONTH,9);
        c.set(Calendar.MONTH,7);
        System.out.println(c.getTime().toLocaleString());
                ;


    }
}
