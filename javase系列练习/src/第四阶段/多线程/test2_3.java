package 第四阶段.多线程;

import java.util.Arrays;

//如何计算两个有序整型数组（没有重复元素）的交集？
//
//例如 a={0,1,2,3,4};b={1,3,5,7,9}; 交集为{1，3}。
//
//获取两个数组中的相同元素并存放到新数组中
public class test2_3 {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4};
        int[] b = {1, 3, 5, 7, 9};
        int[] c=new int[4];
        int count=0;
        for (int a2 :a){
            for (int b2:b){
                if (b2==a2){
                    c[count++]=b2;
                }
            }
        }
        System.out.println(Arrays.toString(c));
    }
}
