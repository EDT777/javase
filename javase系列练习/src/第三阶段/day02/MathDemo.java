package 第三阶段.day02;

//需求：使用Math类常用方法，例如：获取随机数方法
public class MathDemo {
    public static void main(String[] args) {
        int i2 = (int) (Math.random() * 100);
        int a = 10;
        int b = 999;
        int c = Math.max(a, b);
        System.out.println(c);
        System.out.println(i2);
    }
}
