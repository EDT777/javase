package yinyong;

public class yinyong {

	public static void main(String[] args) {
dosome();
yinyong y = new yinyong();
y.doother();
	}
	
	public static void dosome() {
		System.out.println("可直接class调用");
	}
	public void doother() {
		System.out.println("需要引用");
	}

}
