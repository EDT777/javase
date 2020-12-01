package 第四阶段.集合框架.day01;

import java.util.ArrayList;
import java.util.List;

//有如下Student对象，对象中包含姓名（name）、年龄（age）、成绩（score）、班级号（classNum）等成员变量，其中，classNum表示学生的班号，例如“class05”。
public class test2_2 {
    public static void main(String[] args) {
        double sum=0;
        int count=0;
        Student s1=new Student("Tom",18,100,"class05");
        Student s2=new Student("Jerry",22,70,"class04");
        Student s3=new Student("Owen",25,90,"class05");
        Student s4=new Student("Jim",30,80,"class05");
        Student s5=new Student("Steve",28,66,"class06");
        Student s6=new Student("Kevin",24,100,"class04");
        List<Student> studList = new ArrayList<>();
        studList.add(s1);
        studList.add(s2);
        studList.add(s3);
        studList.add(s4);
        studList.add(s5);
        studList.add(s6);
        System.out.println(studList);
        studList.get(1).setScore(90);
        for (int i=0;i<=studList.size()-1;i++){
            if(studList.get(i).getName()=="Kevin"){
                studList.remove(i);
            }
        }
        System.out.println(studList);
        for(Student stu:studList){
            if (stu.getClassNum()=="class05"){
                sum+=stu.getScore();
                count++;
            }
        }
        double avg =sum/count;
        System.out.println(avg);
    }
}
class Student{
    private String name;
    private int age;
    private double score;
    private String classNum;
    Student(){

    }
    public Student(String name, int age, double score, String classNum) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.classNum = classNum;
    }

    public String getName() {
        return name;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", classNum=" + classNum +
                '}';
    }
}