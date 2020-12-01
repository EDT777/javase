package 第一阶段.day_06;

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        if(zhishu(num)){
            System.out.println("是质数");
        }else {
            System.out.println("不是质数");
        }

    }
    public static boolean zhishu(int a){
        if (a == 1){
            return true;
        }
        else if (a == 2){
            return true;
        }
        else {
            for (int i = 2; i < a; i++){
                if (a % i ==0){
                    return false;
                }
            }
        }
        return true;
    }
}
