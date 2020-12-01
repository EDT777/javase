package 第二阶段.day04;
/*
需求:

商品类: Item

具有成员变量,:

​	编号(code)  String类型  商品编号

​	名称(name)  String 类型  商品名称

​	类别(type)  String 类型  商品的具体类别

​	价格(price)  double 类型 商品的价格

​	**总商品数量（totalNum） int 类型 商品的总商品数量**

1)提供两个构造器

​	没有参数的构造器

​	创建一个以编号(code),名称(name) 作为形式参数的构造器

2)编写一个main方法,添加一个商品,其商品信息如下

​	创建两个笔记本电脑的商品(computer),

商品1：

​	编号(code):666

​	名称: 戴尔(DELL) 游戏笔记本

​	类型: 游戏

​	价格: 5499.00

商品2：

​	编号(code):007

​	名称: 苹果（Macbook pro）笔记本

​	类型: 电脑,办公

​	价格: 18000.00

3）在main方法打印笔记本电脑(computer)的名称和价格

**4）每创建一个商品对象总商品数量（totalNum）加一，请在main方法中打印totalNum值。**

 在构造器或者初始化代码块中完成totalNum的自增
 */
public class test2_1 {
    public static void main(String[] args) {
        Item i1 =new Item("戴尔(DELL) 游戏笔记本","666");
        i1.setPrice(5499.00);
        i1.setType("游戏");
        System.out.println(i1);
        Item i2 = new Item("苹果（Macbook pro）笔记本","007");
        i2.setPrice(18000.00);
        i2.setType("电脑,办公");
        System.out.println(i2);
        System.out.println("总商品数为:"+i2.getTotalNum());//总商品数

    }

}
class Item{
    private String code;
    private String name;
    private String type;
    private double price;
    private static int totalNum;
    {
        totalNum+=1;
    }
    Item(){

    }
    Item( String name,String code) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTotalNum() {

        return totalNum;
    }

    public void setTotalNum(int totalNum)
    {
        this.totalNum = totalNum;
    }
}
