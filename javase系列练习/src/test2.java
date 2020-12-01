public class test2 {
    //(1)编写抽象类Person:
    //①成员变量 String name,
    //②编写get,set方法, 构造器, 抽象方法eat();
    //(2)定义Boy类,继承Person类型,重写eat()方法输出”男孩子应该多吃肉,长身体”
    //(3)定义Gril类,继承Person类型,重写eat()方法输出”女孩子应该少吃肉,瘦身材”
    //(4)创建Bog对象, 通过构造器初始化name, 调用eat()方法.
    //(5)创建Girl对象, 通过set方法初始化name, 调用eat()方法
    public static void main(String[] args) {
        Person b =new Boy();
        Person g =new Gril();
        b.setName("男生");
        System.out.println(b.getName());
        b.eat();
        g.setName("女生");
        System.out.println(g.getName());
        g.eat();
    }
}
abstract class Person{
    private String name;
   String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }
    Person(){

    }
    Person(String name){
        this.name=name;
    }
    abstract void eat();
}
class Boy extends Person{

    @Override
    void eat() {
        System.out.println("男孩子应该多吃肉");
    }
}
class Gril extends Person{

    @Override
    void eat() {
        System.out.println("女孩子应该多吃肉");
    }
}