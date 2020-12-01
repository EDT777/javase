package 第二阶段.day05;

//使用类/接口知识，描述下图关系
public class test5 {
    public static void main(String[] args) {
        Gezi g = new Gezi();
        g.lay();
        g.fly();
        Dayan d = new Dayan();
        d.lay();
        d.fly();

        Mayi m = new Mayi();
        m.lay();
        MiFeng m2 = new MiFeng();
        m2.lay();
        m2.fly();


    }
}

class Bird {
    String type = "鸟";
    int leg = 2;

    void lay() {
        System.out.println("生蛋");
    }
}

class Insect {
    String type = "昆虫";
    int leg = 6;

    void lay() {
        System.out.println("产卵");
    }
}

interface IFlyable {
    void fly();
}

class Gezi extends Bird implements IFlyable {

    void lay() {
        System.out.println("鸽子生下鸽子蛋");
    }

    @Override
    public void fly() {
        System.out.println("鸽子飞起来了！");
    }
}

class Dayan extends Bird implements IFlyable {
    void lay() {
        System.out.println("大雁生下大雁蛋");
    }

    @Override
    public void fly() {
        System.out.println("大雁飞起来了！");
    }
}

class Mayi extends Insect {
    void lay() {
        System.out.println("蚂蚁产下蚂蚁卵");
    }

}

class MiFeng implements IFlyable {
    void lay() {
        System.out.println("蜜蜂产下蜜蜂卵");
    }

    @Override
    public void fly() {
        System.out.println("蜜蜂起飞了！");
    }
}
