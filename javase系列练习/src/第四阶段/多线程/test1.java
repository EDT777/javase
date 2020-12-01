package 第四阶段.多线程;
//需求：使用继承方式创建并启动线程
public class test1 {
    public static void main(String[] args) {
            aka a =new aka();
            a.start();
            for (int i=0;i<10;i++){
                System.out.println("main==>"+i);
            }

    }
}
class aka extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(i);
        }

    }
}