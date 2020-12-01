package 第一阶段.day_03;
//需求：输出直角三角形
public class LoopInLoopDemo {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
