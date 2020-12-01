package 第一阶段.day_04;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] num = new int[]{1,22,33,44,5};
        int key=22;
        for (int i=0;i<=num.length;i++){
            if(num[i]==key){
                System.out.println("索引为"+i+"此数为:"+num[i]);
            break;
            }
        }
    }
}
