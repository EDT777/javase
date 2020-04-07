package 抽象工厂;

public class Level2Boss extends Boss {

	@Override
	public void mustKillSkill() {
		System.out.println("我的必杀技是地震");
	}

	@Override
	public int getLife() {
		System.out.println("我的生命值为300");
		return 0;
	}
		
}
