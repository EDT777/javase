package 第二阶段.day02;
//需求：分别求出圆形和矩形的面积
public class AbstractDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.mianji();
        Circle c = new Circle();
        c.mianji();
    }
}

abstract class  AbstractGraph{
    public  abstract void mianji();
}

class Rectangle extends AbstractGraph{
    int chang=10;
    int kuan=50;
    @Override
    public void mianji() {
        System.out.println("面积为:"+chang*kuan);
    }
}

class Circle extends AbstractGraph{
    int r=6;

    @Override
    public void mianji() {
        System.out.println("面积为:"+Math.PI*r*r);
    }
}