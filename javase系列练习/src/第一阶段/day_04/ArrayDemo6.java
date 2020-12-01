package 第一阶段.day_04;

public class ArrayDemo6 {
    public static void main(String[] args) {
        int[] a = new int[]{11,22,33,44,22,55};
        String str = "[";
        for (int i=0;i<=a.length-1;i++){
            str+=a[i];
            if(i!=a.length-1){
                str+=",";
            }else {
                str+="]";
            }
        }
        System.out.println(str);

    }
}
