package 第四阶段.多线程;
//分别创建学生类（Student）和课程类（Course），其中学生类中含有一门课程，还有学生姓名、年龄这两个成员变量。课程类中含有课程名称、成绩。
//
//给出以下学生课程信息表：
//
//​	学生姓名：黄小铭，年龄:14,课程名称：语文，语文成绩：88
//
//​	学生姓名：王飞，年龄:15,课程名称：数学，数学成绩：98
//
//要求：1）按照JavaBean规范定义学生类（Student）和课程类（Course）。
//
//2）使用有参构造器，根据学生课程信息表创建黄小铭和王飞两个对象。
public class test2_1 {
    public static void main(String[] args) {
        Course c1 = new Course("语文",88);
        Course c2 =new Course("数学",98);
        Student s1=new Student("黄小铭",14,c1);
        Student s2=new Student("王飞",15,c2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
class Student{
    private  Course course;
    private String name;
    private int age;

    Student(String name,int age,Course course){
        this.name=name;
        this.age=age;
        this.course=course;
    }
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class Course{
    private String name;
    private double fenshu;

    Course(String name, double fenshu){
        this.name=name;
        this.fenshu=fenshu;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFenshu() {
        return fenshu;
    }

    public void setFenshu(double fenshu) {
        this.fenshu = fenshu;
    }
}