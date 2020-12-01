package 第三阶段.day01;

import java.util.Arrays;

//定义一个商品类(Item)，拥有私有化的成员变量商品名称(name)，商品价格(price)，请提供所有成员变量的setter和getter方法，并且提供一个无参数的构造器和一个所有参数的构造器。
//
//现有字段String text="name：移动硬盘；price：58.0"，请通过常用类的相关方法利用文本text的信息创建一个对应Item对象。
public class ItemDemo {
    public static void main(String[] args) {
        String text = "name：移动硬盘;price：58.0";
        String[] s = text.split(";");
        System.out.println(s[0]);
        System.out.println(s[1]);
        String name = s[0].substring(5, 9);
        String price = s[1].substring(6);
        System.out.println(name);
        System.out.println(price);
        double d = Double.valueOf(price);
        Item i = new Item(name, d);
        System.out.println(i);
    }
}

class Item {
    private String name;
    private double price;

    Item() {

    }

    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
