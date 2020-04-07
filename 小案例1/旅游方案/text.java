package 旅游方案;
/* 找出所有可能的旅游方案 
* 某公司退出自由选旅游服务，但是考虑成本，对路线有一定要求，具体如下： 
* 公司一共有A、B、C、D、E 5个可选景点，游客可以从5个中任选，但必须满足下面三个要求：
* 1、去了A就必须去B， 
* 2、C和D最多去一个，
* 3、E和C要不去要不都不去 
* 请输入景点选择，判断是否满足以上条件

这个题目我们做过类似的，这次要求找出所有可能的方案
*/
import java.util.Scanner;

public class text {
		public static void main(String[] args) {
			System.out.println("提示，1为去，0为不去");
			for(int a=0;a<2;a++) {
				for(int b=0;b<2;b++) {
					for(int c=0;c<2;c++) {
						for(int d=0;d<2;d++) {
							for(int e=0;e<2;e++) {
								
							if(((a==b)||(a==0&&b==1))&&((c!=d)||(c==0&&d==0))&&(d==e)) {
								System.out.println("你选择的方案可行："+" a:"+a+" b:"+b+" c:"+c+" d:"+d+" e:"+e);
							}
							//System.out.println("总共的方案有："+" a:"+a+" b:"+b+" c:"+c+" d:"+d+" e:"+e);
							}
						}
					}
						
				}
			}
			
		}
			/*
			Scanner s = new Scanner(System.in);
			System.out.println("A景点你要去吗？(若去请输入整数1，不去则输入0)");
			int a=s.nextInt();
			System.out.println("B景点你要去吗？(若去请输入整数1，不去则输入0)");
			int b=s.nextInt();
			System.out.println("C景点你要去吗？(若去请输入整数1，不去则输入0)");
			int c=s.nextInt();
			System.out.println("D景点你要去吗？(若去请输入整数1，不去则输入0)");
			int d=s.nextInt();
			System.out.println("E景点你要去吗？(若去请输入整数1，不去则输入0)");
			int e=s.nextInt();
			if((a==1&&b==1)||(a==0||b==1)&&(c!=d)&&e==d) {
				System.out.println("此方案符合条件");
			}
		}*/
}
