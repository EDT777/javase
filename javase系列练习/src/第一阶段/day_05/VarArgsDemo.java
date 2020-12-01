package 第一阶段.day_05;
//需求；定义一个方法，传入两个参数，一个double数组表示多个货品的价格，一个double类型的折扣，返回货品总价格
public class VarArgsDemo {
    public static void main(String[] args) {
        double[] d =new double[]{5.14,125.6,456.2,412.5};
        System.out.println("打完折后总价格为:"+  dazhe(d,0.8));

    }
    public  static double dazhe(double[] d,double dd){
        double sum=0;
        for(double d2:d){
            sum+=d2*dd;
        }
        return sum;
    }
}
