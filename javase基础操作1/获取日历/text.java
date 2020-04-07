package 获取日历;

import java.util.Calendar;

public class text {
public static void main(String [] args) {
	//获取系统当前的日历
	Calendar c =Calendar.getInstance();
	//查看当前日历的"星期几"
	int i =c.get(Calendar.DAY_OF_WEEK);
	System.out.println(i);//周日看为1
}
}
