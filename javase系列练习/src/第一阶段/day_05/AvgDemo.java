package 第一阶段.day_05;
//定义一个方法接收一个 int 类型的二维数组，返回所有元素平均值(int 类型)。
public class AvgDemo {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println(avg(a));
    }
    public static int avg(int[] a){
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum/a.length;
    }
}
