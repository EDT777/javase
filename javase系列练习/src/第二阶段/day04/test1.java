package 第二阶段.day04;
//需求：定义一个狗类Dog，在狗类中定义静态字段和静态方法（属于类的成员），定义非静态字段和非静态方法（属于对象的成员），并在StaticDemo方法中测试调用狗类中的方法和字符
public class test1 {
    public static void main(String[] args) {
        Dog d =new Dog();
        d.StaticDemo();
    }

}
class Dog{
    static int a=10;
    int b=20;
    static void test(){
        System.out.println("测试静态方法");
    }

    void test2(){
        System.out.println("测试非静态方法");
    }
   public  void StaticDemo(){
       new Dog().test2();
       Dog.test();
         System.out.println("获取静态变量:"+Dog.a);
         System.out.println("获取非静态变量:"+new Dog().b);
     }
}