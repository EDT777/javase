package 第一阶段.day_05;
//定义一个方法getAvg, 求出某个数组去掉最大值和最小值之后的平均分.
public class getAvg {
    public static void main(String[] args) {
            int[] a ={1,2,3,4,5,6,7};
            getAvg(a);

    }
    public static void getAvg(int[] a){
        int sum=0;
        int max=a[0];
        int min=a[0];
        int temp;
        //获取最大值
        for (int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        // //获取最小值
        for (int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        for (int i=0;i<a.length;i++){
           if(a[i]!=max && a[i]!=min){
               sum+=a[i];
           }
        }
        System.out.println("除去最大值和最小值元素和为:"+sum);
        System.out.println("除去最大值和最小值平均数为:"+sum/a.length);


    }
}
