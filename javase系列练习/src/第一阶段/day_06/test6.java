package 第一阶段.day_06;

import java.util.Scanner;

//6、一个n位数，判断它是不是回文数。例如：12321是回文数，个位与万位相同，十位与千位相同。
public class test6 {
    public static void main(String[] args) {
        System.out.println("请输入一个数，判断是否为回文数");
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        if(isPnumber(a)){
            System.out.println("是一个回文数");
        }else {
            System.out.println("不是一个回文数");
        }
    }
    public static boolean isPnumber (int num) {
        //定义一个变量,去接收最终颠倒过来的数字
        int newNum = 0;
        int num2 = num;
        while (num2 != 0) {//循环获取位数
            int num3 = num2 % 10;//取个位数
            newNum = newNum * 10 + num3;//得到一个颠倒后的数字
            num2 = num2 / 10; //取出剩下的数字
        }
        System.out.println("颠倒后的数字是:"+newNum);
        return num == newNum;
    }
}
