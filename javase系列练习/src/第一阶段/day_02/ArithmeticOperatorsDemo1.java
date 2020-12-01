package 第一阶段.day_02;


//演示算术运算符
public class ArithmeticOperatorsDemo1 {


    public static void main(String[] args) {
        int a=100;
        int b=10;
        //定义两个变量，分别求出和差积商 （+ - * /）
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        //取模,求余数（%）
        System.out.println(a%b);
        //演示“+”号表示连接符号的例子
        System.out.println("a的值为:"+a);
        System.out.println(8765 / 1000 * 1000);//结果为8000，因为8765/1000 只返回整数8，不保留小数
       // System.out.println(10/0); 除数不能为0 所以会报错
        //演示前置++
        //演示后置++
        int aa =2;
        System.out.println(++aa);//
        int bb=3;
        System.out.println(bb++);

    }
}
