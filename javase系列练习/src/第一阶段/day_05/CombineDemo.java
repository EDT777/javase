package 第一阶段.day_05;

import java.util.Arrays;

//需求：定义一个名为combineArrays的方法，以两个int类型的数组arr1和arr2作为参数，实现将arr1和arr2两个数组合并为一个新的一维数组，并返回合并后的新数组。
public class CombineDemo {
    public static void main(String[] args) {
        int[] a ={1,2,3};
        int[] b={4,5,6};
        int[] newArray =combineArrays(a,b);
        System.out.println(Arrays.toString(newArray));
    }
    public static int[] combineArrays(int[] a,int[] b){
        int length1=a.length;
        int length2=b.length;
        int length_new=length1+length2;
        int[] newArray =new int[length_new];
        int index=0;
        for (int i=0;i<a.length;i++){
            newArray[index]=a[i];
            index++;
        }
        for (int j=0;j<b.length;j++){
            newArray[index]=b[j];
            index++;
        }
        return newArray;
    }
}
