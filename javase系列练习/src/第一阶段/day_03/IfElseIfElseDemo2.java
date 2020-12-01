package 第一阶段.day_03;

import java.util.Scanner;

public class IfElseIfElseDemo2 {
    public static void main(String[] args) {
        int level=16;
        System.out.print("您的在线天数为");
        Scanner Day = new Scanner(System.in);
        int day = Day.nextInt();
        if (day < 16) System.out.println("您的等级为星星");
        else if (day >= 16*3) System.out.println("您的等级为太阳");
        else System.out.println("您的等级为月亮");

    }
}
