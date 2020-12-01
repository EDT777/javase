package 第三阶段.day02;
//需求：使用随机数Random类，通过Random类获取伪随机数
public class RandomDemo {
    public static void main(String[] args) {
        //获取20-110之间的随机数
        double d =20+Math.random()*90;
        System.out.println(d);
    }
}
