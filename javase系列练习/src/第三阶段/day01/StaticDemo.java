package 第三阶段.day01;

import java.util.Arrays;

//需求：使用static方法的方式定义一个操作数组的工具类，并测试
//
//作业目的：熟悉工具类的设计方式
public class StaticDemo {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        akaArray(a);
        System.out.println(Arrays.toString(a));
    }

    public static int[] akaArray(int[] a) {
        a[0] = 123;
        return a;
    }
}
