package 第二阶段.day03;
//需求：定义一个青蛙类（Frog）继承于动物类（Animal），同时实现会走路（IWalkable），会游泳（ISwimable）的接口
public class test1 {
    public static void main(String[] args) {
        Frog f =new Frog();
        f.swim();
        f.print();
    }
}

class Frog extends  Animal implements ISwimable{

    @Override
    public void swim() {
        System.out.println("我在游泳了");
    }
}
class Animal{
    public void print(){
        System.out.println("我是一个动物");
    }
}

interface ISwimable{
    void swim();
}