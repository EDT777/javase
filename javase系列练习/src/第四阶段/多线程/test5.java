package 第四阶段.多线程;
//需求：使用实现方式实现吃苹果案例（线程安全方式1）
public class test5 {
    public static void main(String[] args) {
        aka_a a=new aka_a();
        Thread t =new Thread(a,"大A");
        Thread t2 =new Thread(a,"大B");
        t.start();
        t2.start();
    }
}
class aka_a implements Runnable{

    private int count=50;
    @Override
    public void run() {
        for (int i=0;i<50;i++){
            synchronized (this){
                if (count>0){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"吃了编号:"+count+"的苹果");
                    count--;
                }
            }

        }
    }
}
