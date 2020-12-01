package 第二阶段.day02;

public class test2_1 {
    public static void main(String[] args) {
        wukong w =new wukong("暴富暴富暴富");
        w.name="猴子王";
        w.buddha();
        pig p = new pig("范冰冰");
        p.name="猪王";
        p.holdHorse();
        HeShang h = new HeShang("黄河");
        h.name="和尚王";
        h.pickUpLuge();
    }
}

class Pretice{

    String name;
    int age;
    String weapon;
    public void fight(){
        System.out.println(name+"去战斗了！");
    }
    public void buddha(){
        System.out.println(name+"去念佛了！");
    }
    public void doPilgrimage() {
        System.out.println(name + "去取经了！");
    }
}

class  wukong extends Pretice{
   private String formula;
   wukong(){

   }
   wukong(String formula){
       this.formula=formula;
   }
    public void doMaigre(){
        System.out.println(name+"吃斋了！");
    }
    public void buddha(){
       super.buddha();
        System.out.println("我来念佛咯！"+formula);
    }
    public void extDevil(){
        System.out.println(name+"降妖了");
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }
}
class pig extends Pretice{
    private String wife;
    pig(){

    }
    pig(String wife){
        this.wife=wife;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }
    public void holdHorse(){
        System.out.println(name+"带着老婆"+wife+"开始牵马了");
    }
}

class HeShang extends Pretice{
    private String sandRiver;
    HeShang(String sandRiver){
        this.sandRiver=sandRiver;
    }
    HeShang(){

    }

    public String getSandRiver() {
        return sandRiver;
    }

    public void setSandRiver(String sandRiver) {
        this.sandRiver = sandRiver;
    }
    public void pickUpLuge(){
        System.out.println(name+"5分钟后将会挑行李去"+sandRiver);
    }
}