package 龟兔赛跑多线程;

public class text {

	public static void main(String[] args) {
		System.out.println("龟兔赛跑开始，总路程100米：");
			RabbitThread t1=new RabbitThread();
			TurtleThread t2=new TurtleThread();
			t1.setName("兔子进程-->");
			t2.setName("乌龟进程-->");
			t1.start();
			t2.start();
			while(t1.isAlive()||t2.isAlive()) {
				try {Thread.sleep(10);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(t1.time3<t2.time3) {
				System.out.println("兔子跑赢了");
			}else if(t1.time3>t2.time3) {
				System.out.println("乌龟跑赢了");
			}else if(t1.time3==t2.time3) {
				System.out.println("他们打成平手");
			}
	}

}
