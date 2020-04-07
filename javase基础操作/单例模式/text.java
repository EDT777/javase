package 单例模式;
//单例模式要领：
//1.构造方法私有化
//2.对外提供一个公开的静态的获取当前类型对象方法
//3.提供一个当前类型的静态变量
//单例模式有2种：
//饿汉式：类加载阶段就创建了对象
//懒汉式：用到对象的时候才会创建对象
public class text {

	public static void main(String[] args) {
singleton s1 = singleton.getInstance();
singleton s2 = singleton.getInstance();
singleton s3 = singleton.getInstance();
System.out.println(s1==s2);
System.out.println(s1==s3); 

	}

}
