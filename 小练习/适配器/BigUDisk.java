package 适配器;

public class BigUDisk implements Usb {

	@Override
	public void read() {
		System.out.println("大U盘读取功能");
	}

	@Override
	public void write() {
		System.out.println("大U盘的写入功能");
	}

}
