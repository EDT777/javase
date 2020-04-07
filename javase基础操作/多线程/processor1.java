package 多线程;
//定义一个线程
public class processor1 extends Thread{
	//重写run方法
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("run-->"+i);
		}
	}
}