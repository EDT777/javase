package 第一阶段.day_04;
//求出int类型数组中最大元素值
public class ArrayDemo5 {
    public static void main(String[] args) {
        int[]a = new int[]{5,7,9,1,3,5};
        int max =a[0];
        for (int b:a){
            if(b>max){
                max =b;
            }
        }
        System.out.println("数组的最大值是:"+max);
    }
}
