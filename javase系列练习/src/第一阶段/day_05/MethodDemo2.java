package 第一阶段.day_05;

public class MethodDemo2 {
    public static void main(String[] args) {
        int[] a = new int[]  {
            1, 3, 5, 4
        } ;
        print(3, "谭泽豪");
        print2(a);
        System.out.println(query(a,4));

    }

    //需求1：定义一个方法，打印指定多少行的指定字符串
    public static void print(int line, String s) {
        for (int i = 0; i <= line; i++) {
            System.out.println(s);
        }
    }

    //需求2：定义一个方法，传入一个int数组，按照格式打印int类型数组
    public static void print2(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
            if (i == arr.length-1) {
                str += "]";
            } else {
                str += ",";
            }
        }
        System.out.println(str);
    }
    //需求3：定义一个方法，传入一个int数组，返回指定元素在数组中第一次出现的索引
    public static int query(int[] arr,int a){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==a){
                return i;
            }


        }
        return -1;
    }
}
