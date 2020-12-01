package 第一阶段.day_03;
//需求：求 [1, 500] 之间能整除 7 的数的总和。
public class SevenDemo {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<=500;i++){
            if(i%7==0){
                sum+=i;
            }
        }
        System.out.println("总和为:"+sum);
    }
}
