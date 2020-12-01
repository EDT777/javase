package 第一阶段.day_06;

import java.util.Scanner;

/*
使用switch编写程序，给定一个学生成绩，给出相应等级：
(1)90~100 优秀
(2)80~89 良好
(3)70~79 中等
(4)60~69 及格
(5)0~59 不及格
 */
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请填写该学生成绩");
        int grade = sc.nextInt();
        String s="";
        switch (grade/10){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:s="不及格"; break;
            case 6:s="及格"; break;
            case 7:s="中等";break;
            case 8:s="良好";break;
            case 9:
            case 10:s="优秀";break;
        }
        System.out.println(s);
    }
}
