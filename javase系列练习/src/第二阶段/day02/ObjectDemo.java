package 第二阶段.day02;
//需求：演示Object类中的toString和equals方法
//
//- 创建一个Person类，通过覆盖toString方法，打印Person对象的内容
//
//- 使用==和equals比较两个Person对象，通过结果得到==和equals的区别
public class ObjectDemo {
    public static void main(String[] args) {
        Person p1 = new Person("张三",22);
        Person p2 = new Person("张三",22);
        System.out.println(p1);
        System.out.println(p1.toString());
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
    }
}
class Person{
 private    String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(){

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
