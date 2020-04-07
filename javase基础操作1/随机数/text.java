package 随机数;
import java.util.Random;
public class text {

	public static void main(String[] args) {
		//创建一个随机数生成器
		Random r = new Random();
		//生成int类型的随机数
		//int i = r.nextInt(101);//[0-100]直接的随机数
		//System.out.println(i);
		for(int a =0;a<5;a++) {
			System.out.println(r.nextInt(101));
		}
	}

}
