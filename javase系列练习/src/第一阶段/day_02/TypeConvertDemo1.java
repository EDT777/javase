package 第一阶段.day_02;

public class TypeConvertDemo1 {
    public static void main(String[] args) {
    //需求1
        int a = 32;
        //（1）int类型转换为long
        long b = a;
        //（2）long类型转换为float
        float c = b;
        byte b1 = 1;
        byte b2 = 2;
        int aka = 1;
        int akb = 2;
        int akc = aka + akb;//int类型的值和int类型的值相加，定义变量接收两个变量之和
        double d3 =3.14;
        System.out.println(akc);


        int c2 = 3;
        System.out.println(b2 + c2);//byte类型的值和int类型的值相加，定义变量接收两个变量之和



        System.out.println(b1 + b2);//byte类型的值和byte类型的值相加，定义变量接收两个变量之和L

        char cc='哈';
        int i =cc+aka;
        System.out.println(i);//char类型的值和int类型的值相加，定义变量接收两个变量之和

        double dd =aka+c+d3+b;
        System.out.println(dd);//int、float、double、long类型的值相加，定义变量接收所有变量之和

    //需求2

        int a1a =1;//定义一个int类型变量a1a
        byte b1b =2;//定义一个byte类型变量b1b
        byte c1c = (byte) (a1a+b1b);//定义一个变量接收a1a加b1b的和
        System.out.println(c1c);
        int a2a = (int)3.84;
        System.out.println(a2a);
    }
}
