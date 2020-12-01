package 第一阶段.day_04;
/*
（1）定义一个数组nums,并静态初始化该数组

（2）定义一个变量size获取nums的数组长度

（3）获取数组元素

（4）设置数组元素

（5）遍历数组
 */
public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4};
        int size = a.length;
        System.out.println("数组长度"+size);
        int b = a[0];
        System.out.println(b);
        a[0] =2;
        System.out.println(a[0]);
        for (int bb : a){
            System.out.print(bb);
        }
    }
}
