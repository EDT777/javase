package 万年历;

import java.util.Scanner;

/**
 * 从数学上实现了任意年份的月历显示 该程序可以使用任意年份作为参考点
 * 
 * 
 * 需要资料欢迎大家加<b>班主任Amy老师QQ：2454227267 </b> <br/>
 * 交流技术欢迎大家加<b>Jason老师QQ：1626883728</b>
 * 
 * @author Jason @章鱼教育 www.zyejy.com
 * @date 2019-01-13
 */
public class text {

	public static void main(String[] args) {
		int year = 0;
		int month = 0;
		int daysOfMonth = 0;// 保存这个月的天数
		int weekDay = 0;// 保存这个月第一天的星期，0代表星期天，1-6代表星期一到星期六
		int startWeek = 1;// 参考点日期的星期
		int startYear = 1900;// 参考年份
		Scanner input = new Scanner(System.in);
		// 输入年月
		System.out.print("请输入年份:");
		year = input.nextInt();
		System.out.print("请输入月份:");
		month = input.nextInt();
		// 计算这个月的天数
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			daysOfMonth = 31;
		} else if (month == 2) {
			if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0) {
				daysOfMonth = 29;
			} else {
				daysOfMonth = 28;
			}
		} else {
			daysOfMonth = 30;
		}
		// 计算星期
		// 计算星期的第一步，计算该天距离startYear-1-1的天数
		int totalDays = 0;

		if (year >= startYear) {
			//计算整年的天数
			for (int i = startYear; i < year; i++) {
				totalDays += 365;
				if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
					totalDays++;
				}
			}
			// 计算1月1日到month月1日的天数
			switch (month) {
			case 12:
				totalDays += 30;// 加上11月份的31天
			case 11:
				totalDays += 31;// 加上10月份的31天
			case 10:
				totalDays += 30;// 加上9月份的30天
			case 9:
				totalDays += 31;// 加上8月份的31天
			case 8:
				totalDays += 31;// 加上7月份的31天
			case 7:
				totalDays += 30;// 加上6月份的30天
			case 6:
				totalDays += 31;// 加上5月份的31天
			case 5:
				totalDays += 30;// 加上4月份的31天
			case 4:
				totalDays += 31;// 加上3月份的31天
			case 3:
				totalDays += 28;// 加上2月份的28天
			case 2:
				totalDays += 31;// 加上1月份的31天
			case 1:
				totalDays += 0;
				break;
			default:
				System.out.println("您输入的月份不正确，退出程序");
				System.exit(0);
			}
			// 处理闰年
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && month > 2) {
				totalDays++;
			}
		} else {// 年份小于startYear

			for (int i = year + 1; i < startYear; i++) {
				totalDays += 365;
				if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
					totalDays++;
				}
			}
			// 计算1月1日到month月1日的天数
			switch (month) {
			case 1:
				totalDays += 31;// 加上1月份的31天
			case 2:
				totalDays += 28;// 加上2月份的28天
			case 3:
				totalDays += 31;// 加上3月份的31天
			case 4:
				totalDays += 30;// 加上4月份的30天
			case 5:
				totalDays += 31;// 加上5月份的31天
			case 6:
				totalDays += 30;// 加上6月份的30天
			case 7:
				totalDays += 31;// 加上7月份的31天
			case 8:
				totalDays += 31;// 加上8月份的31天
			case 9:
				totalDays += 30;// 加上9月份的30天
			case 10:
				totalDays += 31;// 加上10月份的31天
			case 11:
				totalDays += 30;// 加上11月份的30天
			case 12:
				totalDays += 31;// 加上12月份的31天
				break;
			default:
				System.out.println("您输入的月份不正确，退出程序");
				System.exit(0);
			}
			// 处理闰年
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && month <= 2) {
				totalDays++;
			}
		}
		// 转换成星期
		if (year >= startYear) {
			weekDay = (startWeek + totalDays % 7) % 7;
		} else {
			weekDay = (7 + startWeek - totalDays % 7) % 7;
		}

		System.out.println("星期天\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
		for (int i = 0; i < weekDay; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i <= daysOfMonth; i++) {
			System.out.print(i + "\t");
			if ((i + weekDay) % 7 == 0) {
				System.out.println();
			}
		}
		input.close();

	}

}
