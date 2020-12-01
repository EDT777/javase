package 第一阶段.day_03;

public class DoWhileDemo {
    public static void main(String[] args) {
        int a=111;
        int b=123;
        while(a>b){
            System.out.println("a>b");
        }

        do{
            System.out.println("a>b");
        }while (a>b);

    }
}
