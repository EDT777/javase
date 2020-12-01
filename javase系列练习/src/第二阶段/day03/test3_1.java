package 第二阶段.day03;



//现有交通工具(Seater)，出租车（Taxi），客机（Airliner），客船（Ship）都属于交通工具。
//
//各交通工具都有品牌(brand)字段和载客行为（manned）。
//
//客机实现了IFly接口中定义的飞天的功能fly（），
//
//出租车实现了IRun接口中定义的道路上跑的功能run（），
//
//客船实现了ISwim接口中定义的游的功能swim（）。
//要求：
//	1)用继承和接口，模拟各交通工具和功能的关系，功能用接口。
//	2)请在测试类的main方法中用多态的知识，
//
//​		调用出租车的run方法，打印“出租车开始跑了”,
//
//​		调用飞机的fly方法，打印“飞机开始飞天了”,
//
//​		调用客船的swim方法，打印“船舶开始在海洋中漂泊了”，
//
//​	调用出租车，客机，客船的载客方法， 分别打印 “我是大众**捷达**出租车，有载客行为”，“我是**波音**飞机，有载客行为”，“我是**泰但尼克号**，有载客行为”。
//
//注：”**捷达**“， ”**波音**“，”**泰但尼克号**“都是各交通工具的品牌
public class test3_1 {
    public static void main(String[] args) {
        Taxi t = new Taxi();
        t.setBrand("大众捷达");
        t.manned();
        t.run();
        Airliner a =new Airliner();
        a.setBrand("波音");
        a.manned();
        a.fly();
        Ship s =new Ship();
        s.setBrand("泰但尼克号");
        s.manned();
        s.swim();
    }
}

class Seater {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

class Taxi extends Seater implements IRun {
    public void manned() {
        System.out.println("我是" + super.getBrand() + "出租车，有载客行为");
    }

    @Override
    public void run() {
        System.out.println("出租车开始跑了");
    }
}

class Airliner extends Seater implements IFly {
    public void manned() {
        System.out.println("我是" + super.getBrand() + "飞机，有载客行为");
    }

    @Override
    public void fly() {
        System.out.println("飞机开始飞天了");
    }
}

class Ship extends Seater implements ISwim {
    public void manned() {
        System.out.println("我是" + super.getBrand() + "有载客行为");
    }

    @Override
    public void swim() {
        System.out.println("船舶开始在海洋中漂泊了");
    }
}

interface IFly {
    void fly();
}

interface IRun {
    void run();
}

interface ISwim {
    void swim();
}

