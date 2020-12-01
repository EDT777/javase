package 第二阶段.day02;


//演示方法覆盖
public class OverrideDemo {
    public static void main(String[] args) {
        Ostrich o =new Ostrich();
        o.fly();
    }

}
class Bird{
    public void fly(){
        System.out.println("飞起！");
    }
}

class Ostrich extends Bird
{
    public void fly(){
        System.out.println("我不飞了，我跑");
    }
}