package 第四阶段.异常处理机制;
//需求：演示捕获单个异常 try-catch的使用
public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            System.out.println("start============");
            System.out.println(1/0);
            System.out.println("end==============");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
