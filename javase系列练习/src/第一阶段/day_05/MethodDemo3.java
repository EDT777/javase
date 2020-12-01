package 第一阶段.day_05;

public class MethodDemo3 {
    public static void main(String[] args) {
        System.out.println(getSum(1,3));
        int[] a ={1,5,0,6,0,8,6};
        System.out.println(printArray(a));
        System.out.println(getFactorial(3));
    }
    //需求1:定义一个方法getSum,计算两个整数数组的总和
    public static int getSum(int a,int b){
        return a+b;
    }
    //需求2:定义一个方法printArray,按照格式打印数组中非0的元素,例如{1,0,2,3,0,4,5}打印出来应该为`[1,2,3,4,5]`
    public static String printArray(int[] a){
        String str = "[";
        for (int i=0;i<a.length;i++){
            if (a[i]!=0){
                str+=a[i];
                if(i==a.length-1){
                    str+="]";
                }else {
                    str+=",";
                }
            }
        }
        return str;

    }
    //需求3:定义一个方法getFactorial,求出n!的结果.阶乘公式为`n! = 1*2*...*n`.
    public static int getFactorial(int n){
        int sum=1;
        for (int i=1;i<=n;i++){
            sum=sum*i;
        }
        return sum;
    }
}
