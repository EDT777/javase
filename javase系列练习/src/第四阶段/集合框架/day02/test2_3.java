package 第四阶段.集合框架.day02;

import java.util.HashSet;
import java.util.Set;

//分别创建员工类（Employee）和部门类（Department），其中员工包含员工姓名（name），年龄(age)。部门类中含有部门名称（deptName），每个部门中含有一个集合（emps）表示一个部门中含有多个员工，每个员工是是唯一的，无需记录添加顺序。
public class test2_3 {
    public static void main(String[] args) {
        Employee e1=new Employee("小斌",22);
        Employee e2=new Employee("地雷",23);
        Employee e3=new Employee("吉吉",21);
        Employee e4=new Employee("东方菇凉",18);
        Employee e5=new Employee("独孤求败",28);
        Employee e6=new Employee("糖糖",25);
        Set<Employee> s1 =new HashSet<>();
        Set<Employee> s2 =new HashSet<>();
        s1.add(e1);
        s1.add(e2);
        s1.add(e3);
        s2.add(e4);
        s2.add(e5);
        s2.add(e6);
        Department d1 =new Department("部门1",s1);
        Department d2 =new Department("部门2",s2);
        System.out.println(d1);
        System.out.println(d2);
    }
}
class Employee{
    private String name;
    private int age;

    public Employee() {
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
}
class Department{
    private String name;
    private Set<Employee> emps;

    public Department() {
    }

    public Department(String name, Set<Employee> emps) {
        this.name = name;
        this.emps = emps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Employee> getEmps() {
        return emps;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", emps=" + emps +
                '}';
    }

    public void setEmps(Set<Employee> emps) {
        this.emps = emps;
    }
}
