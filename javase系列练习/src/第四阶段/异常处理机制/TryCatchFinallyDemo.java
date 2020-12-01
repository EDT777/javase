package 第四阶段.异常处理机制;
//需求：演示捕获多个异常 try-catch-finally的使用
public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("begin=========");
            System.out.println(2/0);
            System.out.println("end=======");
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("aka_End=============");
        }
    }
}
