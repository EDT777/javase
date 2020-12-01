package 第二阶段.day03;



//某公司旗下有三种型号（model）机器人（Roboot） A 、B、 C。
//
//他们都具有姓名name, 型号model的字段 和 走路功能 walk。 其中A 实现了 ISpeak接口中定义的说话功能speak ，B实现了ISee接口中的图像识别功能 see，C 同时实现了说话和识别功能。 请利用继承、接口、多态等知识完成类的设计并编写测试Demo， 创建机器人对象, 并调用实现过的方法。
public class test2_2 {
    public static void main(String[] args) {
        RobootA ra = new RobootA("小a","A");
        RobootB rb = new RobootB("小b","B");
        RobootC rc = new RobootC("小c","C");
        ra.walk();
        ra.speak();
        rb.walk();
        rb.see();
        rc.walk();
        rc.see();
        rc.speak();

    }
}

class Roboot{
    String name;
    String model;
    Roboot(String name,String model){
        this.name=name;
        this.model=model;
    }
    public void walk(){
        System.out.println(name+"开始走路");
    }
}

interface ISpeak{
    void speak();
}

interface ISee{
    void see();
}

class RobootA extends Roboot implements  ISpeak{

    RobootA(String name, String model) {
        super(name, model);
    }


    @Override
    public void speak() {
        System.out.println(name+"可以说话了");
    }
}

class RobootB extends Roboot implements ISee{
    RobootB(String name, String model) {
        super(name, model);
    }

    @Override
    public void see() {
        System.out.println(name+"可以看了");
    }
}
class RobootC extends Roboot implements  ISee ,ISpeak{
    RobootC(String name, String model) {
        super(name, model);
    }

    @Override
    public void speak() {
        System.out.println(name+"可以说话了");
    }

    @Override
    public void see() {
        System.out.println(name+"可以看了");
    }
}