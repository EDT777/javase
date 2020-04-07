package 买票;
import java.util.*;
public class text {

	public static void main(String[] args) {
		System.out.println("请输入您出行的月份：1——12");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("请选择你是头等舱1还是经济舱2");
		int b =s.nextInt();
		double c = 0 ;
		//旺季
		if(12>=a&&a>=4) {
			if(b==1) {
				c=4000*0.9;
			}
			else if (b==2) {
				c=4000*0.8;
			}
		}
		//淡季
		else {
			if(b==1) {
				c=4000*0.5;
			}
			else if (b==2) {
				c=4000*0.4;
			}
		}
		System.out.println("您的机票价格为："+c);
	}

}
