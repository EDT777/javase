package 控制台输入三个整数;

import java.util.Scanner;

//判断3个数字是否为2个奇数 一个偶数
public class text {
		public static void main(String[] args) {
			System.out.println("请输入3个整数");
			Scanner s = new Scanner(System.in);
			int a=s.nextInt();
			int b=s.nextInt();
			int c=s.nextInt();
			
			if((a+b+c)%2==0&&!(a%2==0&&b%2==0&&c%2==0)) {
				System.out.println("你输出有2个奇数一个偶数");
			}else {
				System.out.println("无2奇一偶");
			}
		}
}
