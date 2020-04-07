package 水仙花数;
//找出所以的水仙花数并输出，水仙花数是指数字的每一位的立方和正好为这个数字
public class text {

	public static void main(String[] args) {
			for(int i=0;i<1000;i++) {
				int bai =i/100;
				int shi=i/10%10;
				int ge=i%10;
				if(i==bai*bai*bai+shi*shi*shi+ge*ge*ge) {
					System.out.println(i+"是水仙花数");
				}
			}
	}

}
