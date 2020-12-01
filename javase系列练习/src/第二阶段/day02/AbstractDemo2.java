package 第二阶段.day02;
//需求：演示抽象类特点
//
//- 抽象类不能创建对象，调用没有方法体的抽象方法没有任何意义
//
//- 抽象类中可以同时拥有抽象方法和普通方法
//
//- 抽象类要有子类才有意义，子类必须覆盖父类的抽象方法，否则子类也得作为抽象类
//
public class AbstractDemo2 extends chou{
    public static void main(String[] args) {
        AbstractDemo2 a =new AbstractDemo2();
        a.aka();
        a.aka2();
    }

    @Override
    public void aka() {
        System.out.println("继承的抽象方法演示");
    }
}

abstract class chou{
    public void aka2(){
        System.out.println("正常方法演示");
    };
    public abstract void aka();
}