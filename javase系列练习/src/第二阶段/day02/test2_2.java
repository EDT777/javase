package 第二阶段.day02;

// 需求: 定义商品类, 并封装商品对象
public class test2_2 {
    public static void main(String[] args) {
        Item i1 = new Item("666", " 戴尔(DELL) 游戏笔记本");
        i1.setPrice(5499.00);
        i1.setType("游戏");
        Item i2 = new Item("007", "苹果（Macbook pro）笔记本");
        i2.setType("电脑办公");
        i2.setPrice(18000.00);
        System.out.println(i1.toString());
        System.out.println(i2.toString());
    }
}

class Item {
    Item() {

    }

    Item(String code, String name) {
        this.code = code;
        this.name = name;
    }

    private String code;
    private String name;
    private String type;
    private double price;

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

    @Override
    public String toString() {
        return "Item{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
