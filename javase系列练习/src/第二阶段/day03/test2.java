package 第二阶段.day03;
//需求：我家有一种动物（Animal），你猜它的叫声（shout）是怎么样的，猜不到，因为这个动物有多种形态。
public class test2 {
    public static void main(String[] args) {
        Dog d =new Dog();
        Cat c =new Cat();
        d.shout();
        c.shout();
    }
}

class  Aka_Animal{
    public void shout(){
        System.out.println("啊啊啊啊啊");
    }
}

class Dog extends Aka_Animal{
    public void shout(){
        System.out.println("旺旺旺");
    }
}

class Cat extends Aka_Animal{
    public void shout(){
        System.out.println("妙妙妙");
    }
}