package 人机猜拳;


/**
 * 代表参与游戏的计算机的玩家
 * @author Administrator
 *
 */
public class Computer {
	
	/**
	 * 电脑玩家的当前得分
	 */
	public int score;
	
	/**
	 * 电脑玩家的角色名
	 */
	public String name;
	
	
	/**
	 * 电脑出拳的方法
	 */
	public int showFist(){
		
		//产生1-3的随机数
		int num = (int)(1+Math.random()*3);
		switch (num) {
		case 1:
			System.out.println(this.name+"出的是石头");
			break;
		case 2:
			System.out.println(this.name+"出的是剪刀");
			break;
		case 3:
			System.out.println(this.name+"出的是布");
			break;
		}
		
		return num;
	}
}

