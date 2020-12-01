package 第四阶段.多线程;
//需求：使用继承方式实现吃苹果案例（线程不安全）
public class test3 {
    public static void main(String[] args) {
            aaa a =new aaa();
            a.setName("小A");
            a.start();
            aaa a2 = new aaa();
            a2.setName("小B");
            a2.start();
    }
}
class aaa extends Thread{
    private static int count=50;
    public void run(){
        for (int i=0;i<50;i++){
            if (count>0){
                System.out.println(super.getName()+"吃了编号为"+count+"个苹果");
                count--;
            }

        }

    }
}