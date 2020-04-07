package 异常;

import java.io.*;

public class Throws {

	public static void main(String[] args)  {
		//m1();
		//使用throws处理异常不是真正处理异常而是推卸责任
		//谁调用就会抛给谁
		//上面的m1方法如果出现了异常，因为采用的是上抛给了jvm jvm遇到异常就会推出jvm，下面代码就不会执行
		//System.out.println("666");
		
		//真正的处理
		try {
			m1();
			}catch(FileNotFoundException f){};
			System.out.println("你好");
	}
	
	public static void m1() throws FileNotFoundException  {
		m2();
	}
	
	public static void m2() throws FileNotFoundException {
		m3();
	}
	public static void m3() throws FileNotFoundException {
		new FileInputStream("c:/ab.txt");//FileInputStream构造方法声明位置上使用Throws（向上抛）
	}
}
