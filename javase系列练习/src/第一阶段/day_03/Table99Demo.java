package 第一阶段.day_03;
//需求：打印九九乘法表
public class Table99Demo {
    public static void main(String[] args) {
        for (int i=1;i<10;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"x"+i+"="+i*j+" ");
            }
            System.out.println();
        }
    }

}
