package 计算器;
import java.util.*;
public class text {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("输入2个数字：");
			double a = s.nextDouble();
			double b =s.nextDouble();
			System.out.println("相加之后得出");
			System.out.println(jia(a,b));
	}
	public static double jia(double a,double b) {
		double c =a+b;
		return c;
	}

}
