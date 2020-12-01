package 第二阶段.day01;
//（1）使用无参数构造器创建对象c1并初始化c1的成员变量
//
//（2）使用带参构造器创建对象c2同时初始化成员变量，并调用说话方法
public class test2 {
    public static void main(String[] args) {
        CateDemo c0 = new CateDemo();
        c0.name="小黑猫";
        c0.age=13;
        CateDemo c = new CateDemo("小兰猫",22);
        c.say();
    }
}

class CateDemo{
    String name;
    int age;
    CateDemo(String name,int age){
        this.name=name;
        this.age=age;
    }

    public CateDemo() {

    }

    public void say(){
        System.out.println("我的名字是："+name+"  我今年"+age+"岁了");
    }
}
