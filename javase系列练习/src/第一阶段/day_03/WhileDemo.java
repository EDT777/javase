package 第一阶段.day_03;
//需求：计算100以内的正整数和
public class WhileDemo {
    public static void main(String[] args) {
        int number=1;
        int sum=0;
        while (number<=100){
            sum+=number;
            number++;
        }
        System.out.println("整数和为："+sum);
    }
}
