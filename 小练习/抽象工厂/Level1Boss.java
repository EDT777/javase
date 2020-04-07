package 抽象工厂;
//实体产品：第一关的boss
public class Level1Boss extends Boss {

	@Override
	public void mustKillSkill() {
		System.out.println("我的必杀技是喷火");
	}

	@Override
	public int getLife() {
		System.out.println("我的生命值为100");
		return 0;
	}
		
}
