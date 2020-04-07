package 抽象工厂;

public class Level1Enemy extends Enemy {

	public int getAllcount() {
		System.out.println("第一关敌人为20个");
		return 0;
	}

	public String fire() {
		System.out.println("第一关敌人开火方式为缩头乌龟滚过来");
		return "";
	}

	public int getLife() {
		System.out.println("第一关每个敌人生命值为20");
		return 0;
	}

}
