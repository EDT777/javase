package 第一阶段.day_05;
//需求：演示基本数据类型值传递机制和引用数据类型值传递机制的区别
public class MethodParamDemo {
    public static void main(String[] args) {
        int[] a={10,2,3};
        int a2=10;
        jiben(a2);
        System.out.println(a2);
        yinyong(a);
        System.out.println(a[0]);
    }
    public static  void jiben(int a){
        System.out.println("begin");
        a=100;
        System.out.println("a为:"+a);
        System.out.println("end");
    }

    public static  void yinyong(int[] a){
        System.out.println("begin");
        a[0]=100;
        System.out.println("a[0]为:"+a[0]);
        System.out.println("end");
    }
}
