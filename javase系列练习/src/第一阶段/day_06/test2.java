package 第一阶段.day_06;

import java.util.Scanner;

//给定某年某月某日，判断这一天是这一年的第几天？
public class test2 {
    public static void main(String[] args) {
        System.out.println("请输入年份");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println("请输入今天几号");
        int day = sc.nextInt();
        int sum = 0;
        if (getLeap(year)) {
            switch (month){
                case 12:sum+=32;
                case 11:sum+=31;
                case 10:sum+=32;
                case 9:sum+=32;
                case 8:sum+=32;
                case 7:sum+=32;
                case 6:sum+=31;
                case 5:sum+=32;
                case 4:sum+=31;
                case 3:sum+=31;
                case 2:sum+=29;
                case 1:sum+=31;
            }
            sum += day;
        } else {
            switch (month) {
                case 12:sum+=31;
                case 11:sum+=30;
                case 10:
                    sum += 31;
                case 9:
                    sum += 30;
                case 8:
                    sum += 31;
                case 7:
                    sum += 31;
                case 6:
                    sum += 30;
                case 5:
                    sum += 31;
                case 4:
                    sum += 30;
                case 3:
                    sum += 31;
                case 2:
                    sum += 28;
                case 1:
                    sum += 31;
            }
            sum += day;
        }
        System.out.println("今天是今年第"+sum+"天");
    }

    public static boolean getLeap(int a) {
        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
