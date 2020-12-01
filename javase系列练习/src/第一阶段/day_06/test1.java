package 第一阶段.day_06;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        System.out.println("请输入一个年份");
        Scanner sc = new Scanner(System.in);
        int year =sc.nextInt();
        if (getLeap(year)){
            System.out.println(year+"是闰年");
        }else {
            System.out.println(year+"不是闰年");
        }
    }
    public static boolean getLeap(int a){
        if((a%4==0 && a%100!=0 )|| (a%400==0)){
            return true;
        }else {
            return false;
        }
    }
}
