package 第一阶段.day_03;
//需求：打印 [1, 100] 正方形数，如果一个数字等于某一个数字的平方，那么这个数为正方形数
public class SquareNumberDemo {
    public static void main(String[] args) {
        int i,j;
        System.out.print("1~100中的正方形数有");
        for (i=1;i<=100;i++){
            for (j=1;j<=10;j++){
                if( i%j==0 && i/j==j ) {
                    System.out.print(i+" ");
                    break;
                }
            }
        }
    }
}
