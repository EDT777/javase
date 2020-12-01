package 第一阶段.day_06;

import java.util.Arrays;
import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
            int[] a ={1,2,3,4,5,6,7};
            int[] b =new int[7];
        System.out.println("删除之前"+ Arrays.toString(a));
        System.out.println("请输入删除的指定索引");
        Scanner sc =new Scanner(System.in);
        int index = sc.nextInt();
        int count=0;
        for(int i=0;i<a.length;i++){
            if(i!=index){
                b[count]=a[i];
                count++;
                if(i==a.length-1){
                    b[count]=-1;
                }
            }
        }
        System.out.println("删除之后"+Arrays.toString(b));
    }

}
