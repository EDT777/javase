package 第二阶段.day05;

/*
3、 唐僧带着悟空去取经,到了午饭时间, 唐僧吃稀饭 , 悟空吃香蕉.请将唐僧和悟空的状态(name)和行为(eat)分别封装到Person 和 Monkey 两个类中,已知Person 和 Monkey这两个类有一个共同的父类 Animal,要求使用继承和覆写的思想完.成三个类的定义并在测试类的main方法中使用多态的思想创建 “唐僧” 和 “悟空” 两个对象,并分别调用 eat方法实现打印 “唐僧吃稀饭” 和 “悟空吃香蕉 *
 */
public class test3 {
    public static void main(String[] args) {
        Animal p = new Person();
        p.name = "唐僧";
        Animal m = new Monkey();
        m.name = "悟空";
        System.out.println(p.name + "带着" + m.name + "去取经,到了午饭时间");
        p.eat();
        m.eat();
    }
}

class Person extends Animal {

    void eat() {
        System.out.println(name + "吃稀饭");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Monkey extends Animal {

    void eat() {
        System.out.println(name + "吃香蕉");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Animal {
    String name;

    void eat() {
        System.out.println("吃东西");
    }
}

