package 第一阶段.day_02;

import java.util.Scanner;

public class DigitDemo {
    public static void main(String[] args) {
        System.out.println("请输入一个三位数的整数");
        Scanner sc = new Scanner(System.in);
        int abc =sc.nextInt();
        int bai = abc/100;
        int shi =abc/10%10;
        int ge= abc%10;
        System.out.println("百位是:"+bai);
        System.out.println("十位是:"+shi);
        System.out.println("个位是:"+ge);
    }
}
