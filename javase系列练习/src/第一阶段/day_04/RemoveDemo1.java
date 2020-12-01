package 第一阶段.day_04;

import java.util.Arrays;

//需求：定义一个整型数组，将数组中的0去掉后返回一个新数组。
public class RemoveDemo1 {
    public static void main(String[] args) {
        int count=0;
        int[] arr={1,13,45,5,0,0,16,6,0,25,4,17,6,7,0,15};
        for (int i=0;i<arr.length-1;i++){
            if(0==arr[i]){
                count++;
            }
        }
        int leng=arr.length -count;
        int[] aka = new int[leng];
        int count2=0;
        for (int j=0;j<=arr.length-1;j++){
            if(arr[j]!=0){
                aka[count2]=arr[j];
                count2++;
            }
        }
        System.out.println(Arrays.toString(aka));

    }
}
