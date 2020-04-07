package 龟兔赛跑多线程;

public class TurtleThread extends Thread{
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
					i-=6;
					System.out.println("当前线程名称为："+currentThread().getName()+"乌龟还剩余"+i+"路程");
				}
				long time2=System.currentTimeMillis();
				 time3=time2-time1;
				System.out.println("乌龟跑到了终点，用时为:"+time3);
			}
}
