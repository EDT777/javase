package 日期始终;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;

//已知一个工作需要的时间为n天，考虑周末不算工作日，输入一个起始日期，计算该工作应完成的结束日期
//提示：先计算有几周零几天，然后整周使用7周数结合Calendar推算日期，在考虑剩余的几天.
//也可以直接循环，只是遇到周末时要跳过
public class text {

	public static void main(String[] args) throws ParseException {
				Scanner scn  =new Scanner(System.in);
				System.out.println("请输入起始日期(格式为yyyy-MM-dd):");
				String startDateStr = scn.nextLine();
				System.out.println("请输入任务所需的工作日数:");
				int days =scn.nextInt();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				Date startDate =sdf.parse(startDateStr);//解析日期
				Calendar cal =Calendar.getInstance();//创建日历
				cal.setTime(startDate);//设定日历日期
				//第一种方式：逻辑推算
				if(cal.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY) {
					cal.add(Calendar.DATE, 2);//这两天不算工作日，直接往后推算
				}else if(cal.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) {
					cal.add(Calendar.DATE,1);//这1天不算工作日，直接往后推算
				}
				
				int weekCount =days/5;//
				int leftDays =days%5;//余下天数
				cal.add(Calendar.DATE, weekCount*7);//整周按7天加进去
				
				int currentWeek =cal.get(Calendar.DAY_OF_WEEK);//得到推算整周后对应日期的星期
				if(currentWeek+leftDays>=7) {//加上最后几天后会到周六
					leftDays +=2;//直接推移会包含星期六星期天
				}
				cal.add(Calendar.DATE, leftDays);//剩余几天加进去
				System.out.println("任务结束日期为："+sdf.format(cal.getTime()));
				
				//-------------------------------------------------------------------------------------------------
				//第二种方法：循环推算
				cal.setTime(startDate);//设定日历日期
				if(cal.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) {
					cal.add(Calendar.DATE, 2);//这刘安共同都不算工作日，直接往后推算
				}else if (cal.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY) {
					cal.add(Calendar.DATE, 2);
				}
				for(int i=0;i<days;i++) {
					cal.add(Calendar.DATE, 1);
					//周末直接跳过
					if(cal.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY) {
						cal.add(Calendar.DATE,2 );
					}else if(cal.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) {
						cal.add(Calendar.DATE, 1);
					}
				}
				System.out.println("任务结束日期为："+sdf.format(cal.getTime()));
				
				System.out.println("日为"+cal.get(Calendar.DATE));
						
	
	}

}
