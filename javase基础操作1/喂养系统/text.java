package 喂养系统;

public class text {

	public static void main(String[] args) {
//多态作用：提高扩展度 降低耦合度
		master tzh = new master();
		cat yql= new cat();
		nake n = new nake();
		tzh.feed(n);
		tzh.feed(yql);
	
	}

}
