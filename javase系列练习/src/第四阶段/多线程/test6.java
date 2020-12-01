
package 第四阶段.多线程;
//需求：使用实现方式实现吃苹果案例（线程安全方式2）
public class test6 {
    public static void main(String[] args) {
            bka b =new bka();
            Thread t =new Thread(b,"小A");
            Thread t2 =new Thread(b,"小B");
            t.start();
            t2.start();
    }
}
class bka implements Runnable{
    private int count=50;
    @Override
    public void run() {
        for(int i=0;i<50;i++){
            eat();
        }
    }
   synchronized void eat(){
        if(count>0){
            System.out.println(Thread.currentThread().getName()+"吃了编号为"+count+"的苹果");
            count--;
        }
    }
}