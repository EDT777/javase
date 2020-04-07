package 旅游景点;
import java.util.*;
public class text {

	public static void main(String[] args) {
			System.out.println("依次输入A--E景点是否去，去输入1，不去输入2");
			Scanner s = new Scanner(System.in);
			System.out.println("去a吗？");
			int a =s.nextInt();
			System.out.println("去b吗？");
			int b =s.nextInt();
			System.out.println("去c吗？");
			int c =s.nextInt();
			System.out.println("去d吗？");
			int d =s.nextInt();
			System.out.println("去e吗？");
			int e =s.nextInt();
			if(a==1&&b==1&&c!=d&&e==c) {
				System.out.println("可行的");
			}
			else {
				System.out.println("方案不可行");
			}
	}

}
