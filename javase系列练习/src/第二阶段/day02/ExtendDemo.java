package 第二阶段.day02;
//需求：使用面向对象的知识定义出老师（Teacher）、学生（Student）、员工（Employee）三个类, 抽取出三者的共同父类Person
public class ExtendDemo {
    public static void main(String[] args) {
        fu f = new fu();
        teacher t = new teacher();
        Student s =new Student();
        Yuangong y = new Yuangong();
        t.name="谭老师";
        s.name="谭学生";
        y.name="谭员工";
        t.teach();
        s.rest();
        y.work();
    }
}
class fu{
    String name;
    int age;
    public void rest(){
        System.out.println(name+"开始休息咯~");
    }
}

class teacher extends fu{
    int level;
    public void teach(){
        System.out.println(name+"开始授课了");
    }
}

class Student  extends fu {
    int stu;

    public void learn() {
        System.out.println(name + "开始学习了");
    }
}
class Yuangong extends fu{
    int timeStatus;
    public void work(){
        System.out.println(name+"开始工作咯！");
    }
}