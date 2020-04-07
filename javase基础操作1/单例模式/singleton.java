package 单例模式;
//懒汉式
public class singleton {
	private static singleton s;
	
	private  singleton() {}

	public static singleton getInstance() {
	
	if(s==null)
	{
		s = new singleton();
	}
	return s;
}
}
