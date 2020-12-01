package 第一阶段.day_02;

public class ChangeVarDemo {
    public static void main(String[] args) {
        int num1=10;
        int num2=50;
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1:"+num1);
        System.out.println("num2:"+num2);
    }
}
