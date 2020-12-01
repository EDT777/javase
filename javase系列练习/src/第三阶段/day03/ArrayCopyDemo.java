package 第三阶段.day03;

import java.util.Arrays;

//需求：定义一个方法，进行数组拷贝，并调用System中的数组拷贝方法
public class ArrayCopyDemo {
    public static void main(String[] args) {
        int[] a = {1, 5, 2, 4, 1, 5, 6};
        int[] b = new int[10];
        aka(a, 1, b, 1, 3);
        System.out.println(Arrays.toString(b));
    }

    public static void aka(int[] a, int indexa, int[] b, int indexb, int length) {
        for (int i = 0; i <= length - 1; i++) {
            b[indexb + i] = a[indexa + i];
        }
    }
}
