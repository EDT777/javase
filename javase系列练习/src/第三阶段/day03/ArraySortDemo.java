package 第三阶段.day03;

import java.util.Arrays;

//需求：定义一个方法，进行数组排序，并调用Arrays中的排序方法
public class ArraySortDemo {
    public static void main(String[] args) {
        int[] a={1,4,2,3,15,};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
