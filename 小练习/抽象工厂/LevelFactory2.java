package 抽象工厂;
//实体工厂：第一关工厂。负责所有第一关的所有对象的实现
public class LevelFactory2 extends GameLevelFactory{

	@Override
	public Boss createBoss() {
		return new Level2Boss();
	}

	@Override
	public Enemy createEnemy() {
		return new Level2Enemy();
	}
}

