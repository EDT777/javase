package 第三阶段.day03;
//需求：在main方法中实现如下功能并打印结果：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
public class FallDemo {
    public static void main(String[] args) {
        double high=100;
        int sum=0;
        for (int i=1;i<=10;i++){
                sum+=high;
                high= high/2;
        }
        System.out.println("共经过"+sum+"米"+",第十次反弹"+high+"高");
    }
}
