package 第二阶段.day03;
//已知生物(Biology)、动物(Animal)、人(Person)三个接口。其中:
//
//- 生物接口定义呼吸方法(breathe)；
//
//- 动物接口除具备生物接口特征之外，还定义了吃饭(eat)和睡觉(sleep)两个方法；
//
//- 人接口除具备动物接口特征外，还定义了思维(think)和学习(study)两个抽象方法。
//
//1) 请使用继承的思想定义上述三个接口 ,
//
//2) 定义一个学生类(Student)实现上述人接口。
//
//3) 定义测试类TestDemo ,使用多态的思想在main方法中创建Student的对象 , 调用相应的功能分别实现打印
//
// “我能思考” ; “我能学习” ; “我能睡觉” ; “我能吃饭” ;”我能呼吸”
public class test2_1 {
    public static void main(String[] args) {
        Person r =new Student();
        r.breathe();
        r.eat();
        r.sleep();
        r.study();
        r.think();
    }
}

interface Biology{
        void breathe();
}
interface Aka_Animal2 extends Biology{
    void eat();
    void sleep();
}
interface Person extends Aka_Animal2{
    void think();
    void study();
}

class Student implements Person{

    @Override
    public void breathe() {
        System.out.println("我能呼吸");
    }

    @Override
    public void eat() {
        System.out.println("我能吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("我能睡觉");
    }

    @Override
    public void think() {
        System.out.println("我能思考");
    }

    @Override
    public void study() {
        System.out.println("我能学习");
    }
}
