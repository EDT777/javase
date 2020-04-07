package 判断奇偶;
import java.util.*;
public class text {

	public static void main(String[] args) {
			 System.out.println("输入3个整数");
			 Scanner s = new Scanner(System.in);
			 int a =s.nextInt();
			 int b =s.nextInt();
			 int c =s.nextInt();
			 
			 if(a%2==0&&b%2==0&&c%2!=0) {
				 System.out.println("2个奇数一个偶数");
			 }
			 else if (c%2==0&&b%2==0&&a%2!=0) {
				 System.out.println("2个奇数一个偶数");
			 }
			 else if (a%2==0&&b%2==0&&b%2!=0) {
				 System.out.println("2个奇数一个偶数");
			 }
			 else {
				 System.out.println("否");
			 }
	}

}
