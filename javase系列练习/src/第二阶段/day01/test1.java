package 第二阶段.day01;
//需求：描述猫类
public class test1 {
    String name;
    int age;
    public void  say(){
        System.out.println("我的名字是"+name+"  我的年龄是:"+age+"岁");
    }

    public static void main(String[] args) {
        test1 c = new test1();
        c.name="小红猫";
        c.age=22;
       c.say();
    }
}

//需求：作为Cat类和对象的测试类