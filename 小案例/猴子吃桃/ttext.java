package 猴子吃桃;
/*猴子第一天摘下若干个桃子，当即吃掉一般，还不过瘾，
又吃了一个。第二天早上又吃掉剩下的一半，然后多吃一个
这样反复，直到第10天只有一个桃子，请问原来有几个桃子*/
public class ttext {
		public static void main(String[] args) {
			int day=10;
			int tao=1;
			for( ;day>1;day--) {
				System.out.println("第"+day+"天的桃子数量为:"+tao);
				tao=(tao+1)*2;
			}
			System.out.println("原来的桃子有："+tao+"个");
		}
}
