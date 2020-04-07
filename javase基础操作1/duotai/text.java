package duotai;

public class text {

	public static void main(String[] args) {

		cat c = new cat();
		c.move();//这是方法覆盖即方法重写
		bird b = new bird();
		b.move();
		animal a =new animal();
		a.move();
		
		animal aa =new cat();//多态用法，优先执行cat.class里的move()
		aa.move();
	}

}
