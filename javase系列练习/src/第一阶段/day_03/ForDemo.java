package 第一阶段.day_03;
//演示for语句的使用
public class ForDemo {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        for(int j=1;j<=100;j++){
            sum+=j;
        }
        System.out.println(sum);
    }
}
