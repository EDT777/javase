package 第二阶段.day02;



//分别创建学生类（Student）和课程类（Course），
//
//学生类中含有学生姓名、年龄这两个成员变量。
//
//课程类中含有课程名称、成绩。
//
//创建两个学生对象, 给出以下学生课程信息表：
//
//​	学生姓名：黄小铭，年龄:14,
//
//​	学生姓名：王飞，年龄:15,
//
//创建两门课程对象:
//
//​	课程名称：语文，语文成绩：88
//
//​	课程名称：数学，数学成绩：98
//要求：
//
//1）按照JavaBean规范定义学生类（Student）和课程类（Course）。
//
//2）使用有参构造器，根据学生课程信息表创建黄小铭和王飞两个对象。
//
//3) 思考: 如何建立学生和课程的关系, 让黄小铭拥有语文这门课程, 王飞拥有数学这门课程
//
//​		提示: 在学生类中添加一个课程类型的成员变量, 然后提供对应的setter方法, 将对应的课程对象设置给对应的学生对象
public class test3_2 {
    public static void main(String[] args) {
        Aka_Student a = new Aka_Student("黄小铭",14);
        Aka_Student b =new Aka_Student("王飞",15);
        Course c = new Course("语文",88);
        Course c2 = new Course("数学",98);
        a.setcourse(c);
        b.setcourse(c2);
        System.out.println(a);
        System.out.println(b);
    }
}

class Aka_Student{
    private String name;
    private int age;
    private Course course;
    Aka_Student(){

    }
    Aka_Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Course getcourse() {
        return course;
    }

    public void setcourse(Course course) {
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
        return "Aka_Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }
}
class Course{
    private String courseName;
    private int grade;
    Course(){

    }
    Course(String courseName,int grade){
        this.courseName=courseName;
        this.grade=grade;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
