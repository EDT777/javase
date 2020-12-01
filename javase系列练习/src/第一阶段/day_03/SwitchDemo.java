package 第一阶段.day_03;

import java.util.Scanner;
//需求：使用switch来完成,根据输入的一个数字，判断是星期几？
public class SwitchDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请在1-7中，输入一个整数");
        int weekday=sc.nextInt();
        switch (weekday){
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            case 3:
                System.out.println("周三");
                break;
            case 4:
                System.out.println("周四");
                break;
            case 5:
                System.out.println("周五");
                break;
            case 6:
                System.out.println("周六");
                break;
            case 7:
                System.out.println("周日");
                break;
            default:
                System.out.println("你输入的值不在范围内");
        }
    }
}
