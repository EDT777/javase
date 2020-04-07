package 抽象工厂;
//抽象工厂，描述每一关需要哪些抽象产品
public abstract class GameLevelFactory {
	//创建一个boss对象
		public abstract Boss createBoss();
		//创建敌人
		public abstract Enemy createEnemy();
		//抽象工厂的起始使用方法，通过该方法返回一个抽象工厂(其子类实体工厂)
		public static GameLevelFactory getFactory(int level) {
			switch(level) {
			case 1 :
				return new LevelFactory1();
			
			case 2 :
				return new LevelFactory2();
				
				default:
					return null;
			}
		}
}
