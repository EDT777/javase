package chuandi;

public class text {

	public static void main(String[] args) {
    user u = new user(21);
    add(u);//传递的是堆内存上的地址
    System.out.println("add->"+u.age);
 
    
	}
	public static void add(user a) {
		a.age++;
		System.out.println("add->"+a.age);
	}

}
class user{
	int age;
	//构造方法
	public   user(int i) {
		age = i ;
	}
}
