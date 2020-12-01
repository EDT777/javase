package 第三阶段.day02;

import java.util.Calendar;
import java.util.Date;

//需求：查询某个时间最近一周的信息，如何表示最近这一周的开始时间和结束时间
public class test7 {
    public static void main(String[] args) {
        Date d =new Date();
        System.out.println(d.toLocaleString());//结束时间
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.add(Calendar.DAY_OF_MONTH,-7);
        System.out.println(c.getTime().toLocaleString());//开始时间
    }
}
