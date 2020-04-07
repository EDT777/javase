package 适配器;
//将大的USB接口转为TYPE
//通过对象持有方式实现
public class Usb2UsbTypeCAdapter  implements UsbTypeC {
	
	private BigUDisk disk;

	public Usb2UsbTypeCAdapter(BigUDisk disk) {
		this.disk=disk;
	}
	public void read1() {
		disk.read();//调用大U盘方法
	}

	@Override
	public void write1() {
		disk.write();
	}
	//将大的USB接口转为TYPEC
	
}
