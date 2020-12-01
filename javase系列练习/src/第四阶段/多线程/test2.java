package 第四阶段.多线程;
//需求：使用实现方式创建并启动线程
public class test2 {
    public static void main(String[] args) {
        Thread t =new Thread(new aka_2());
        t.start();
    }
}
class aka_2 implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("aka=>"+i);
        }
    }
}