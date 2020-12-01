package 第四阶段.异常处理机制;
//需求：演示返回异常throws的使用
public class ThrowsDemo {
    public static void main(String[] args){
        System.out.println("=========begin");
        try {
                aka();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("异常了");
        }

    }
    public static void aka() throws Exception{
        System.out.println(2/0);
    }
}
