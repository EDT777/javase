package 第四阶段.集合框架.day01;
//集合使用.
//
//①写一个点类Point, 有X,Y坐标.		Point<String>
//
//②创建5个Point对象, 添加到list集合ArrayList中  List<>
//
//List<Point<String>> list = new ArrayList<>();
//
//③删除索引为2的点对象		remove(int index)   remove(Object obj)
//
//④再把list合集中索引为3的点对象修改成坐标X=3,Y=3的点对象
//
//⑤遍历list集合对象并打印输出该list对象

import java.util.ArrayList;
import java.util.List;

//注意: 不要一遍遍历,一遍删除/添加元素
public class test2_1 {
    public static void main(String[] args) {
        AkaPoint<String> p1 = new AkaPoint<>("1","小A");
        AkaPoint<String> p2 = new AkaPoint<>("2","小B");
        AkaPoint<String> p3 = new AkaPoint<>("3","小C");
        AkaPoint<String> p4 = new AkaPoint<>("4","小D");
        AkaPoint<String> p5 = new AkaPoint<>("5","小E");
        List<AkaPoint<String>> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.get(3).setX("3");
        list.get(3).setY("3");
        System.out.println(list.get(3));
        for (AkaPoint ap :list){
            System.out.println(ap);
        }
    }
}
class AkaPoint<T>{
    private T x;
    private T y;
    AkaPoint(){

    }

    public AkaPoint(T x, T y) {
        this.x = x;
        this.y = y;
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
        return "AkaPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
