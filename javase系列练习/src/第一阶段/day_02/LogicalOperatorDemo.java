package 第一阶段.day_02;



public class LogicalOperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println((a > b) & (a > c));//（1）与操作
        System.out.println((a > b) | (a > c));//（2）或操作
        System.out.println(!(a > b));//取反
    }
}
