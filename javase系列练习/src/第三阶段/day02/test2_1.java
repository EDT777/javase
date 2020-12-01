package 第三阶段.day02;
//利用接口的知识，写个计算器，能完成两个数的加减乘除运算
//
//​	1）定义一个接口computer含有一个方法int Compute(int n,int m);
//
//​	2）定义加（Add）、减（Subtract）、乘（Multiply）、除（Divide）四个类,分别实现此接口，并分别覆盖computer方法完成加减乘除运算
//
//​	3）设计一个类UseCompute，含有方法：public void useCom(Computer com, int num1,int num2)
//
//此方法要求能够：1．用传递过来的对象调用computer方法完成运算
//
//2．输出运算的结果
//
//​	4）设计一个测试类，调用UseCompute中的方法useCom来完成加减乘除运算
public class test2_1 {
    public static void main(String[] args) {
        Computer a =new Add();
        Computer s = new Subtract();
        Computer M=new Multiply();
        Computer D = new Divide();
        UseCompute u =new UseCompute();
        u.useCom(a,4,2);
        u.useCom(s,4,2);
        u.useCom(M,4,2);
        u.useCom(D,4,2);

    }
}

interface Computer{
    int Compute(int n,int m);
}
class Add implements  Computer{

    @Override
    public int Compute(int n, int m) {
        return n+m;
    }
}
class Subtract implements Computer{

    @Override
    public int Compute(int n, int m) {
        return n-m;
    }
}
class Multiply implements Computer{

    @Override
    public int Compute(int n, int m) {
        return n*m;
    }
}
class Divide implements Computer{

    @Override
    public int Compute(int n, int m) {
        return n/m;
    }
}
class UseCompute{
    public void useCom(Computer com,int num1,int num2){
        System.out.println(com.Compute(num1,num2));
    }
}

