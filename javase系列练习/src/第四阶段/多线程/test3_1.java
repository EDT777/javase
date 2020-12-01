package 第四阶段.多线程;
//1、请编写程序利用线程输出从A到Z的字母，每隔一秒钟输出一个数字，请按顺序输出。
//
//2、现有一百个快递待派发，定义快递类Expresses 作为公共资源类，定义快递员线程类Mailman ,请开启三个线程派发此100个快递，并打印哪个快递员派发了哪一个快递。最后打印出每个快递员派发了多少快递
public class test3_1 extends Thread {
    public static void main(String[] args) {
        test3_1 t =new test3_1();
        t.start();
    }

    public void run(){
        for (int i=65;i<(65+26);i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println((char)i);
        }
    }
}
