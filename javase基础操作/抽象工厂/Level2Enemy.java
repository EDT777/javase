package 抽象工厂;

public class Level2Enemy extends Enemy {

	public int getAllcount() {
		System.out.println("第2关敌人为200个");
		return 0;
	}

	public String fire() {
		System.out.println("第2关敌人开火方式为咬人");
		return "";
	}

	public int getLife() {
		System.out.println("第2关每个敌人生命值为30");
		return 0;
	}

}
