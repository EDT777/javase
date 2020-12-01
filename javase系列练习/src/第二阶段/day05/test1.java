package 第二阶段.day05;
//（1）创建一个叫做机动车的类：
//
//字段：车牌号(String)，车速(int)，载重量(double)
//
//功能：加速(车速自增)、减速(车速自减)、修改车牌号，查询车的载重量。
//
//编写两个构造方法：一个没有形参，在构造器中将车牌号设置“XX1234”，速
//
//
//
//度设置为100，载重量设置为100；另一个能为对象的所有属性赋值；
//（2）创建主类：
//
//在主类中创建两个机动车对象。
//
//创建第一个时调用无参数的构造方法，调用成员方法使其车牌为“辽A9752”，并让其加速。
//
//```java
//
//```
//
//
//
//创建第二个时调用有参数的构造方法，使其车牌为“辽B5086”,车速为150,载重为200，并让其减速。
//
//输出两辆车的所有信息,需要在Car类中覆盖Object中的toString方法
public class test1 {
    public static void main(String[] args) {
        Car c =new Car();
        c.setNum("辽A9752");
        System.out.println(c.toString());
        c.jiasu();
        Car c2=new Car();
        c2.setNum("辽B5086");
        c2.setSpeed(150);
        c2.setLoad(200);
        System.out.println(c2.toString());
        c2.jiansu();

    }
}
class Car{
    private String num;
    private int speed;
    private double load;

    Car(){
        this.num = "xx1234";
        this.speed = 100;
        this.load = 100;
    }
    void jiasu(){
        System.out.println(num+"号车开始加速了时速最终抵达"+speed);
    }
    void jiansu(){
        System.out.println(num+"号车开始减速了,最终减速到"+(speed-(load/2)));
    }
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Car{" +
                "num='" + num + '\'' +
                ", speed=" + speed +
                ", load=" + load +
                '}';
    }
}
