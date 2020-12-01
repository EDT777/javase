package 第二阶段.day04;

public class test4 {
    public static void main(String[] args) {
       IUSB i =new IUSB() {
           @Override
           public void eat() {
               System.out.println("使用接口实现匿名内部类");
           }
       };
       i.eat();
       Animal a =new Animal() {
           @Override
           public void eat() {
               System.out.println("创建子类匿名内部类");
           }
       };
       a.eat();
    }

}
interface IUSB{
        void eat();
}
abstract class Animal{
     public   abstract void eat();

}