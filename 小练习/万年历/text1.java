package 万年历;
import java.util.*;
public class text1 {

	public static void main(String[] args) {
		//输入年历和月份
		Scanner s = new Scanner(System.in);
		System.out.println("请输入要输出月历的年份和月份");
		int year =s.nextInt();
		int month =s.nextInt();
		//计算指定年份月份的号到1900年1月1日的天数
		int totalDays=0;
		//1.求出从1900年1月1日到指定年份1月1日的整年天数：使用循环
		for(int i=1900;i<year;i++) {
			totalDays+=365;
			if(i%4==0&&i%100!=0||i%400==0) {
				totalDays++;
			}
		}
		//2.求出指定年份1月1日到指定年份月份1日的天数：switch的穿透
		switch(month){
			case 12:totalDays+=30;
			case 11:totalDays+=31;
			case 10:totalDays+=30;
			case 9:totalDays+=31;
			case 8:totalDays+=31;
			case 7:totalDays+=30;
			case 6:totalDays+=31;
			case 5:totalDays+=30;
			case 4:totalDays+=31;
			case 3:
				if(year%4==0&&year%100!=0||year%400==0) {
					totalDays+=29;
				}else {
					totalDays+=28;
				}
			case 2:totalDays+=31;
				
;
		}
		//推算指定年份月份1号的星期
		int weekday =totalDays%7+1;//1代表星期1，7代表星期天
		System.out.println("计算出的星期为："+weekday);
		//算出当月天数
			int monthDays =31;
			if(month ==4||month==6||month==9||month==11) {
				monthDays =30;
			}
			else if (month==2) {
				if(year%4==0&&year%100!=0||year%400==0) {
					monthDays =29;
				}else {
					monthDays =28;
				}
			}
	
		//输出
		//1.输出表头
			System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期天\t");
			//2.输出前面的空格
			for(int i =0;i<weekday-1;i++) {
				System.out.print("\t");
			}
			//3.开始接着输出日期
			for(int i=1;i<=monthDays;i++) {
				System.out.print(i+"\t");
				if((i+weekday-1)%7==0) {
					System.out.println();
				}
				
			}
	}

}
