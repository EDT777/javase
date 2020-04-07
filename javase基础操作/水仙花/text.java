package 水仙花;

public class text {
public static void main(String[] args) {
		for(int i=100;i<1000;i++) {
			int bai=i/100;//得到百位
			int shi=i/10%10;//得到十位
			int ge =i%10;//得到个位
			boolean b =bai*bai*bai+shi*shi*shi+ge*ge*ge==i;
			if(b) {
				System.out.println(i+"是水仙花数");
			}
		}
	
}
}
