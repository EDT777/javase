package 第四阶段.多线程;
//使用实现方式实现吃苹果案例（线程不安全）
public class test4 {
    public static void main(String[] args) {
        bbb b =new bbb();
        Thread t =new Thread(b,"小A");
        Thread t2=new Thread(b,"小B");
        t.start();
        t2.start();
    }
}
class bbb implements Runnable{

    private  int count=50;
    @Override
    public void run() {
        for (int i=0;i<50;i++){
            if (count>0){
                System.out.println(Thread.currentThread().getName()+"吃了第"+count+"个苹果");
                count--;
            }

        }
    }
}
