package 第四阶段.集合框架.day01;
//需求：定义一个Point类，并为Point类中的成员变量(x/y)定义泛型和使用泛型
public class PointDemo {
    public static void main(String[] args) {
        Point<String> p =new Point<>();
        p.setX("啊啊啊啊");
        p.setY("哈哈哈");
        System.out.println(p.getX());
        System.out.println(p.getY());
        System.out.println(p);
    }
}
class Point<T>{
    private T x;
    private T y;

    public Point() {
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}