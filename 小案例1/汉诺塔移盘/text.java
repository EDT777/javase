package 汉诺塔移盘;
/*汉诺塔：将A柱上的4个盘放在C柱上，一次只能移一个输出如下：
 * 将圆盘1从A移动到B
 * 将圆盘2从A移动到C
 * 将圆盘1从B移动到C
 * 将圆盘3从A移动到B
 * 将圆盘1从C移动到A
 * 将圆盘2从C移动到B
 * 将圆盘1从A移动到B
 * 将圆盘4从A移动到C
 * 将圆盘1从B移动到C
 * 将圆盘2从B移动到A
 * 将圆盘1从C移动到A
 * 将圆盘3从B移动到C
 * 将圆盘1从A移动到B
 * 将圆盘2从A移动到C
 * 将圆盘1从B移动到C
 */
public class text {

	public static void main(String[] args) {
			hannuo(4,"A","B","C");
	}
	
	static void hannuo(int n,String a,String b,String c) {
		if(n==1) {
			System.out.println("将圆盘"+n+"从"+a+"移动到"+c);
		}else {
			hannuo(n-1,a,c,b);
			System.out.println("将圆盘"+n+"从"+a+"移动到"+c);
			hannuo(n-1,b,a,c);
		}
	}

}
