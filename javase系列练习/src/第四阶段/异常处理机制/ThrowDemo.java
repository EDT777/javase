package 第四阶段.异常处理机制;
//需求：演示返回异常throw的使用
public class ThrowDemo {
    public static void main(String[] args) throws Exception {
        String s ="aka";
        if(s=="aka"){
            throw  new Exception("牛皮，确实是有了aka");
        }
    }
}
