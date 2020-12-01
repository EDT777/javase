package 第一阶段.day_03;
//需求：打印正三角形
public class RegularTriangleDemo {
    public static void main(String[] args) {
        for(int i = 0 ; i <= 20 ; i ++){
            for(int j = 20 - i ; j > 0 ; j --){
                System.out.print(" ");
            }

            for(int j = 1 ; j <= 2*i-1 ; j++){
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
