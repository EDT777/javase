package 多线程;
import java.lang.*;	
public class start1 {
		public static void main(String[] args) {
			//创建线程
			Thread t = new processor1();
			//启动
			t.start();//这段代码执行瞬间结束，告诉jvm再分配一个新的栈给t线程
			//run方法不需要手动调用，系统线程启动后自动调用
			
			//t.run()  这是一个普通方法调用，这样做程序只有一个线程，run方法结束之后 下面代码才能继续执行
			
			//这段代码在主线程执行
			for(int i=0;i<10;i++) {
				System.out.println("main-->"+i);
			}
			//有了多线程以后，main方法结束只是主线程栈中没有方法栈帧了
			//但是其他线程或者其他栈中还有栈帧
			//main方法结束，程序可能还在运行
		}
		
	
	
}
