public class test6 {
    //2、使用单例编写一个算术工具类MathUtil，并定义一个求商的方法getDivide，
    // 方法接收两个int类型参数：num1、num2，返回num1 / num2的商，如果num2为0则抛出ArithmeticException（算术异常）。
    public static void main(String[] args) {
       MathUtil mm= MathUtil.getInstance();
        System.out.println(mm.getDivide(4,2));
    }
}
class MathUtil{
    private static MathUtil m = new MathUtil();
    private MathUtil(){

    }
    static MathUtil getInstance(){
        return m;
    }
  public double getDivide(int num1,int num2){

        if (num2==0){
            throw new ArithmeticException();
        }
         return    num1/num2;

    }
}