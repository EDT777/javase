package 第二阶段.day03;

public class test3 {
    public static void main(String[] args) {
        Fish f =new Fish();
        f.swim();
    }
}

class Fish implements Aka_ISwimable {

    @Override
    public void swim() {
        System.out.println("游啊游啊游啊游");
    }
}

interface Aka_ISwimable{
    void swim();
}