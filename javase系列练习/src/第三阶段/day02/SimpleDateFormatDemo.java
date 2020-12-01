package 第三阶段.day02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date d =new Date();
        System.out.println(d);
        System.out.println(d.toString());
        System.out.println(d.getTime());
        System.out.println(d.toLocaleString());
        System.out.println("=========================");
        String pattern ="yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String s1 = sdf.format(d);
        Date d2 =sdf.parse(s1);
        System.out.println(s1);
        System.out.println(d2);
    }
}
