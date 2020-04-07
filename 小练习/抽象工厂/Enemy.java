package 抽象工厂;
//抽象产品：代表敌人
public abstract class Enemy {
	//定义敌人有多少个
		public abstract int getAllcount();
		
		//定义敌人开火行为
		public abstract String fire();
		//获取生命值
		public abstract int getLife();
}
