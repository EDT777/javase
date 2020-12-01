package 第一阶段.day_02;
//需求：计算 12 个月贷款利息之和（totalInterest）。假如学费(tuition) 16000.00，每月利率（rate）1%，不用利滚利。
public class ScoreDemo {
    public static  final  double TUITION =16000;

    public static void main(String[] args) {
        double rate =0.01;
        double total = TUITION+(TUITION*12*rate);
        System.out.println(total);
    }
}
