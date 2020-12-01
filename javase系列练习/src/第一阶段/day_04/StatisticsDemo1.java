package 第一阶段.day_04;

import java.util.Arrays;

//需求：定义一个 int 类型,长度为2的数组，
// 其索引 0 位置存放指定数组索引为偶数的元素之和，索引 1 位置存放指定数组索引为奇数元素之和。
public class StatisticsDemo1 {
    public static void main(String[] args) {
        int ji=0;
        int ou=0;
            int[] array = new int[]{10,20,30,40,50,60,70,80};
            for (int i=0;i<array.length-1;i++){
                if(i%2==0){
                    ou+=array[i];
                }else {
                    ji+=array[i];
                }
            }
            int[] aka =new int[]{ou,ji};
        System.out.println(Arrays.toString(aka));
     }
}
