package 内部类;

import 内部类使用.text;

//静态内部类可以看作静态变量
//内部类重要作用：可以访问外部类中私有的数据
//静态内部类可以访问外部类的静态数据，无法访问成员
//成员内部类不能有静态声明 	
//成员内部类可以访问外部类所有数据  此代码是静态内部类
public class text {

	private static String s ="A";
	
	private String s2="B";
	
	private static void m1() {
		System.out.println("static m1()");
	}
	private void m2() {
		System.out.println("m2()");
	}
	static class innerclass{
		public static void m3() {
			System.out.println(s);
			m1();
			//m2();
			//System.out.println(s2); 若是成员内部类即可执行此代码
		}
		public void m4() {
			System.out.println(s);
			m1();
		}
		public static void main(String[] args) {
			text.innerclass.m3();
			innerclass i =new text.innerclass();
			i.m4();
		}
	}
}
