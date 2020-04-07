package 单例模式;
//饿汉式
public class ehan {

	private static ehan s = new ehan();
	private ehan() {}
	public static ehan getInstance() {
		return s;
	}
}
