package 桌子接口;

public class desk {
	//需要桌面子
	private desktop desktop;
	//需要腿
	private leg leg;
	
	public void showinfo() {
		System.out.println("这是一张桌子，信息为");
		System.out.println(this.desktop.getinfo());
		System.out.println(this.leg.getinfo());
		System.out.println();
	}
	
	public desktop getdesktop() {
		return desktop;
	}
	
	public void setdesktop(desktop desktop) {
		this.desktop=desktop;
	}
	
	public leg getleg() {
		return leg;
	}
	
	public leg setleg(leg leg) {
		return this.leg=leg;
	}
}
