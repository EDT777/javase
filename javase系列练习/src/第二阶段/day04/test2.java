package 第二阶段.day04;
/*
需求：演示final修饰符的特点

- final修饰的类：表示最终的类, 该类不能再有子类

- final修饰的方法：最终的方法, 该方法不能被子类覆盖

- final修饰的变量：表示常量，该变量只能赋值一次，不能再重新赋值。

- 基本数据类型：表示的值不能改变

- 引用数据类型：所引用的地址值不能改变


 */
public class test2 extends test{
        public final static int AKA= 100;//表示常量，该变量只能赋值一次，不能再重新赋值。
    public static void main(String[] args) {
        test t =new test();
        t.aka();
        finalClass f =new finalClass();
        finalClass f2=new finalClass();//不能生成，因为引用地址不冷改变

    }

}

final class finalClass{
//表示最终的类, 该类不能再有子类
}
class test{
    final void aka()
    {//最终的方法, 该方法不能被子类覆盖
        System.out.println("不可替代的最终方法！");
    }
}

