package 抽象工厂;
/*这是一个创建型设计模式(单例，简单工厂都是)
 * 抽象工厂:创建一系列抽象的产品的设计模式
 * 系列：多个，共同特征
 * 好处：实现对象的生产和使用之间的解耦
 * 
 * 实现：1.抽象产品：蘑菇，敌人，地形，boss的抽象父类
 * 2.编写抽象工厂：负责生产所有管卡所需要的对象的接口或者类的描述
 * 3.编写实体产品：每一个管卡中实际的敌人，地形等等
 * 4.编写实体工厂：生产某一个关卡所有抽象产品的具体实现类
 * 5.在抽象工厂中创建静态方法实现实际工厂的创建（类型还是抽象工厂）
 * 代码效果：所有用户这边完全不需要知道所谓的实体的实现类，以及所谓系列之间的关系，只需要了解抽象工厂和抽象产品即可
 抽象工厂的不足：系列的改变
 */

//以下为抽象工厂用户：抽象产品的使用者
public class text {
		private Boss boss;
		private Enemy enemy;
		
		private GameLevelFactory factory;
		//当前的level
		private int level =1;
		private static final int MAX_LEVEL =2;
		
		public void startGame() {
			while(level<=MAX_LEVEL) {
				//获取各种游戏参数
				//先获得工厂
				this.factory=GameLevelFactory.getFactory(level);
				this.boss=factory.createBoss();
				this.enemy=factory.createEnemy();
				//按照游戏逻辑开始游戏
				enemy.getAllcount();
				enemy.getLife();
				boss.getLife();
				boss.mustKillSkill();
				//如果玩家还存活，则继续到下一关
				level++;
			}
		}
		public static void main(String[] args) {
			text t= new text();
			t.startGame();
		}
}
