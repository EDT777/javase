package 桌子接口;

public class text {

	public static void main(String[] args) {
		desk desk = new desk();
		//装桌面子
		desk.setdesktop(new glassdesktop());
		//腿
		desk.setleg(new woodleg());
		//输出信息
		desk.showinfo();
		//接口化的好处：其实现类可以随时改变
		desk.setdesktop(new wooddesktop());
		
		desk.showinfo();
	}

}
