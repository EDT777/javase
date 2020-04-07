package 龟兔赛跑多线程;

public class RabbitThread extends Thread {
			public int i=100;
			public long time3;
			public void run() {
				long time1=System.currentTimeMillis();
				while(i>0) {
					try {
						Thread.sleep(200);
					}catch(Exception e) {
						e.printStackTrace();
					}
				i-=14;
				if(i==44) {
					System.out.println("兔子：乌龟太慢了，我睡一觉再跑");
					try {
						Thread.sleep(2000);
					}catch(Exception e) {
						e.printStackTrace();
					}
					System.out.println("兔子:休息好了，我继续跑");
				}
				System.out.println("当前线程名称为："+currentThread().getName()+"兔子还剩"+i);
				}
				long time2=System.currentTimeMillis();
				 time3=time2-time1;
				System.out.println("兔子跑完了，用时："+time3);
				
			}
}
