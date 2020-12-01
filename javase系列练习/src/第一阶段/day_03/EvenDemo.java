package 第一阶段.day_03;
//需求：找出 [1, 500] 之间偶数的个数。
public class EvenDemo {
    public static void main(String[] args) {
        int count=0;
        for (int i=1;i<=500;i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println("有"+count+"个偶数");
    }
}
