package 第二阶段.day01;

public class test4 {
    public static void main(String[] args) {
        wukong w = new wukong("小孙悟空",22,"金箍棒","紧箍咒啦啦啦");
        bajie b = new bajie("大猪八戒",21,"筷子","范冰冰");
        heShang h = new heShang("沙和尚",23,"叉子","黄河");
        w.buddha();
        b.fight();
        h.doPilgrimage();

    }
}

class wukong{
    String name;
    int age;
    String weapon;
    String formula;

    public wukong(String name, int age, String weapon, String formula) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
        this.formula = formula;
    }

    public void doMaigre(){
        System.out.println(name+"开始吃斋了");
    }
    public void buddha(){
        System.out.println(name+"开始念佛了！");
    }
    public void doPilgrimage(){
        System.out.println(name+"开始取经了！");
    }
    public void fight(){
        System.out.println(name+"开始战斗了！");
    }
    public void extDevil(){
        System.out.println(name+"开始降妖了！");
    }
}

class bajie{
    String name;
    int age;
    String weapon;
    String wife;

    public bajie(String name, int age, String weapon, String wife) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
        this.wife = wife;
    }

    public void buddha(){
        System.out.println(name+"开始念佛了");
    }
    public void doPilgrimage(){
        System.out.println(name+"开始取经了！");
    }
    public void fight(){
        System.out.println(name+"开始战斗了");
    }
    public void holdHorse(){
        System.out.println(name+"开始牵马了");
    }
}

class heShang{
    String name;
    int age;
    String weapon;
    String sandRiver;

    public heShang(String name, int age, String weapon, String sandRiver) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
        this.sandRiver = sandRiver;
    }

    public void  buddha(){
        System.out.println(name+"开始念佛了");
    }
    public void doPilgrimage(){
        System.out.println(name+"开始取经了");
    }
    public void fight(){
        System.out.println(name+"开始战斗了");
    }
    public void pickUpLuge(){
        System.out.println(name+"开始挑行李了");
    }
}

