package 第二阶段.day05;
//定义一个杯子类，有两个私有的有颜色（String 类型），容量(int 类型)的字段，定义一个装的方法（打印装液体）。再分别定义茶杯类和咖啡类继承别杯子类，重写装的方法，分别打印装茶和打印装咖啡。定义一个测试类，传递颜色值和容量值创建三个对象，之后打印出每个对象的颜色和容量值，并调用装的方法。
public class test2 {
    public static void main(String[] args) {
        glass g = new glass("红色",300);
        glass c =new Coffee("咖啡色",200);
        glass t =new tea("黑色",555);
        g.put();
        c.put();
        t.put();
    }
}
class glass{
    private String color;
    private int capacity;

    glass(){

    }
    glass(String color,int capacity){
        this.color=color;
        this.capacity=capacity;
    }
    void put(){
        System.out.println("装液体！");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
class Coffee extends glass{
    Coffee(){

    }
    Coffee(String color,int capacity){
        super(color,capacity);
    }
    void put(){
        System.out.println("装咖啡");
    }
}

class tea extends glass{
    tea(){

    }
    tea(String color,int capacity){
        super(color,capacity);
    }
    void put(){
        System.out.println("装茶");
    }
}