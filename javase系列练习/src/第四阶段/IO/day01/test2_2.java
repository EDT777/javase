package 第四阶段.IO.day01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//读取文件中的内容
//
//2) 将文件中的内容转换成Student对象(姓名-年龄-分数)
//
//3) 求出学生总分数
public class test2_2 {
    public static void main(String[] args) throws IOException {
        FileReader fr =new FileReader("AKA/a/aka.txt");
        char[] c =new char[1024];
        double sum=0;
        int len=0;
        StringBuilder sb =new StringBuilder();
        while ((len=fr.read(c))!=-1){
            sb.append(new String(c,0,len));
        }
        System.out.println(sb);
        List<Student> list =new ArrayList<>();
        String[] ss =sb.toString().split(";");
        for (String s:ss){
            String[] as =s.split("-");
            Student student =new Student(as[0],Integer.parseInt(as[1]),Double.parseDouble(as[2]));
            list.add(student);
        }
        System.out.println(list);
        System.out.println("学生总分数为:");
        Iterator<Student> it =list.iterator();
        while (it.hasNext()){
            Student s = it.next();
            sum+=s.getFenshu();
        }
        System.out.println(sum);
    }
}
class Student{
    private String name;
    private int age;
    private double fenshu;

    public Student() {
    }

    public Student(String name, int age, double fenshu) {
        this.name = name;
        this.age = age;
        this.fenshu = fenshu;
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

    public double getFenshu() {
        return fenshu;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", fenshu=" + fenshu +
                '}';
    }

    public void setFenshu(double fenshu) {
        this.fenshu = fenshu;
    }
}