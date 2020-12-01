package 第二阶段.day03;
//需求：演示类型转换和instanceof关键字的使用
public class InstanceofDemo {
    public static void main(String[] args)  {
        fu f =new demo();
        f.aka();
        System.out.println(f instanceof demo);
        System.out.println(f instanceof fu);
    }
}
class demo extends fu{
        public void aka(){
            System.out.println("我是小弟");
        }
}

class  fu{
    public void aka(){
        System.out.println("我是大哥");
    }
}