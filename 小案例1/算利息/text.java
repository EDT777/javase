package 算利息;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

//输入存款开始日期和结束日期，根据需要安排存款期(比如5年，1年)
//实现理论的充分利用(认为每次转存都没有耽误)
public class text {

	public static void main(String[] args) throws ParseException {
			Scanner scn=new Scanner(System.in);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			//给定一笔钱，给定存款期限，计算出不同存款方式的利息
			DecimalFormat format =new DecimalFormat("#.00");
			//存款年利率，分别代表活期，7天，三个月，六个月，一年，二年，三年，五年存期
			double[] yearlyAccrual= {0.3/100,1.1/100,1.43/100,1.69/100,1.95/100,2.73/100,3.575/100,3.575/100};
			System.out.println("请输入存款日期(格式为\"yyyy-MM-dd\"):");
			Date startDate = sdf.parse(scn.next());
			System.out.println("请输入存款日期(格式为\"yyyy-MM-dd\"):");
			Date stopDate = sdf.parse(scn.next());
			//处理为Calendar实例便于后续计算
			Calendar calStartDate=Calendar.getInstance();
			calStartDate.setTime(startDate);
			Calendar calStopDate=Calendar.getInstance();
			calStopDate.setTime(stopDate);
			
			int days=(int)((stopDate.getTime()-startDate.getTime())/(3600*24*1000));
			
			System.out.println("请输入存款金额：");
			BigDecimal money = new BigDecimal(scn.nextDouble());
			BigDecimal accrual = new BigDecimal(0);
			BigDecimal temp = new BigDecimal(0);
			
			//依次尝试5年期，3年期，2年期，1年期，6月，3月，7天，活期
			
			
			do {
				calStartDate.add(Calendar.YEAR,5);
				if(calStartDate.compareTo(calStopDate)<=0) {
					//按5年期存，起始日期减少5年
					temp =money.multiply(new BigDecimal(5)).multiply(new BigDecimal(yearlyAccrual[7]));
					accrual=accrual.add(temp);
					System.out.println("转存日期:"+sdf.format(calStartDate.getTime())+",5年期利息"+format.format(temp.doubleValue())+",当前本金为:"+format.format(accrual.add(money)));
				
				}else {
					//重新计算日期
					calStartDate.add(Calendar.YEAR,-5);
					break;
				}
				
				
			
			}while(true);
			
			//尝试3年期
		
			do {
				calStartDate.add(Calendar.YEAR, 3);
				if(calStartDate.compareTo(calStopDate)<=0) {
					//按3年期存，起始日期减少3年
					temp=new BigDecimal(3*yearlyAccrual[6]).multiply(accrual.add(money));
					accrual = accrual.add(temp);
					System.out.println("转存日期为:"+sdf.format(calStartDate.getTime())+",3年期利息:"+(format.format(temp.doubleValue()))+",当前本金为:"+format.format(accrual.add(money)));
					
				}else {
					//重新计算日期
					calStartDate.add(Calendar.YEAR, -3);
					break;
				}
			}while(true);
			//尝试2年期
			do {
				calStartDate.add(Calendar.YEAR, 2);
				if(calStartDate.compareTo(calStopDate)<=0) {
					//按3年期存，起始日期减少3年
					temp = new BigDecimal(2*yearlyAccrual[5]).multiply(accrual.add(money));
					accrual = accrual.add(temp);
					System.out.println("转存日期："+sdf.format(calStartDate.getTime())+",2年期利息:"+format.format(temp.doubleValue())+",当前本金为:"+format.format(accrual.add(money)));
				}else {
					//重新计算日期
					calStartDate.add(Calendar.YEAR, -2);
					break;
				}
			}while(true);
			
			//尝试1年期
			do {
				calStartDate.add(Calendar.YEAR, 1);
				if(calStartDate.compareTo(calStopDate)<=0) {
					temp=new BigDecimal(yearlyAccrual[4]).multiply((money.add(accrual)));
					accrual =accrual.add(temp);
					System.out.println("转存日期:"+sdf.format(calStartDate.getTime())+",1年期利息:"+
					format.format(temp.doubleValue())+",当前本金为:"+format.format(accrual.add(money)));
				}else {
					//重新计算日期
					calStartDate.add(Calendar.YEAR, -1);
					break;
				}
				
			}while(true);
			
			//尝试6个月
			do {
				calStartDate.add(Calendar.MONTH, 6);
				if(calStartDate.compareTo(calStopDate)<=0) {
					temp=new BigDecimal(6*yearlyAccrual[3]).multiply(money.add(accrual)).divide(new BigDecimal(12),6,RoundingMode.HALF_UP);
					accrual=accrual.add(temp);
					System.out.println("转存日期为："+sdf.format(calStartDate.getTime())+",6月期利息:"+format.format(temp.doubleValue())+",当前本金为:"+format.format(accrual.add(money)));
					
				}else {
					//重新计算日期
					calStartDate.add(Calendar.MONTH, -6);
					break;
				}
			}while(true);
			
			//尝试3月
			do {
				calStartDate.add(Calendar.MONTH, 3);
				if(calStartDate.compareTo(calStopDate)<=0) {
					temp=new BigDecimal(3*yearlyAccrual[2]).multiply(money.add(accrual)).divide(new BigDecimal(12),6,RoundingMode.HALF_UP);
					accrual =accrual.add(temp);
					System.out.println("转存日期为:"+sdf.format(calStartDate.getTime())+",3月期利息:"+format.format(temp.doubleValue())+",当前本金为:"+format.format(accrual.add(money)));
					
				}else {
					//重新计算日期
					calStartDate.add(Calendar.MONTH, -3);
					break;
				}
			}while(true);
			
			//尝试7天
			calStartDate.add(Calendar.DATE, 7);
			days =(int)(calStopDate.getTime().getTime()-calStartDate.getTime().getTime())/(3600*24*1000);
			if(calStartDate.compareTo(calStopDate)<=0) {
				temp=new BigDecimal(days*yearlyAccrual[1]).multiply(money.add(accrual)).divide(new BigDecimal(360),6,RoundingMode.HALF_UP);
				accrual=accrual.add(temp);
				//这里计算的天数要减去，前面只减了7天
				calStartDate.add(Calendar.DATE, (days-7));
				System.out.println("转存日期"+sdf.format(calStartDate.getTime())+",7天通知存款利息："+format.format(temp.doubleValue())+"，当前本金："+format.format(accrual.add(money)));
				
			}else {
				calStartDate.add(Calendar.DATE, -7);
			}
			
			//只能计算活期
			days=(int)((calStopDate.getTime().getTime()-calStartDate.getTime().getTime())/(3600*24*100));
			temp=new BigDecimal(days*yearlyAccrual[0]).multiply(money.add(accrual).divide(new BigDecimal(360),6,RoundingMode.HALF_UP));
			accrual=accrual.add(temp);
			System.out.println("活期利息共"+days+"天："+format.format(temp.doubleValue())+",本金为："+format.format(money.add(accrual)));
			DecimalFormat di = new DecimalFormat("#.##");
			System.out.println("一共的利息为："+di.format(accrual));
			
	}

}
