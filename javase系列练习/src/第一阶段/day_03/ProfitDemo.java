package 第一阶段.day_03;

import java.util.Scanner;

public class ProfitDemo {
    public static void main(String[] args) {
        int profit;
        double bonus = 0;
        System.out.print("您今年的利润为(万元)");
        Scanner P = new Scanner(System.in);
        profit = P.nextInt();
        if (profit<=10) bonus = profit*0.1;
        else if (profit<= 20) bonus = 10*0.1+(profit-10)*0.075;
        else if (profit<= 40) bonus = 10*0.1+(20-10)*0.75+(profit-20)*0.05;
        else bonus = 10*0.1 + (20-10)*0.075 + (40-20)*0.05 + (profit-40)*0.03;
        System.out.println();
        System.out.print("您今年的奖金总数为"+bonus+"万元");
    }
}
