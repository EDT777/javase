package 第二阶段.day04;

public class test3 {

    {
        System.out.println("初始化代码块");
    }

    static {
        System.out.println("我是静态代码块");
    }

    public static void main(String[] args) {
        test3 t =new test3();
        System.out.println("我是主方法代码块");
        test3 t2 =new test3();
    }
}
