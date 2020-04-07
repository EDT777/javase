package 内部类;
//匿名内部类优点：少定义一个类
//缺点：只能用一次
public class niming  {
 public static void m1(xitong x) {
	 x.logout();
 }

 public static void main(String[] args) {
	// 整个new xitong(){}就是匿名内部类
	m1(new xitong() {public void logout() {
		System.out.println("系统登出");
	}});
	
	 
}
 
}

interface xitong{
	void logout();
}
