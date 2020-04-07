package 人机猜拳;


import java.util.Scanner;

/**
 * 代表参与游戏的人的玩家
 * 
 * @author Administrator
 * 
 */
public class Person {

	/**
	 * 人玩家的当前得分
	 */
	public int score;

	/**
	 * 人玩家的姓名
	 */
	public String name;

	/**
	 * 人出拳的方法
	 */
	public int showFist() {
		Scanner input = new Scanner(System.in);
		int num;
		do {
			System.out.print("请输入您猜拳的数字(1、石头 2、剪刀 3、布):");
			num = input.nextInt();
			switch (num) {
			case 1:
				System.out.println(this.name + "出的是石头");
				break;
			case 2:
				System.out.println(this.name + "出的是剪刀");
				break;
			case 3:
				System.out.println(this.name + "出的是布");
				break;

			default:
				System.out.println(this.name + "的输入不正确");
				break;
			}
		} while (num < 1 || num > 3);

		return num;
	}
}
