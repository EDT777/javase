package 内部类;
//局部内部类等于局部变量
//重点：局部内部类在访问局部变量的时候，局部变量必须用final修饰。

public class jubu {

	public void m1() {
		//局部变量
		final int i=10;
		//局部内部类不能访问控制权限修饰符修饰
		//内部类也不能有静态声明
		class innerclass{
			public void m2() {
				System.out.println(i);
			}
			
		}
		//调用m2
		innerclass in = new innerclass();
		in.m2();
	}
	public static void main(String[] args) {
		jubu j = new jubu();
		j.m1();
	}
}
