package 第四阶段.集合框架.day02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

//1) 创建一个List，在List 中增加三个工人，基本信息如下：
//
//​	姓名 		年龄 		工资
//
//​	zhang3 	18 		  3000
//
//​	li4 			 25 		  3500
//
//​	wang5 	 22 		  3200
//
//2) 在li4 之前插入一个工人，信息为：
//
//​		姓名：zhao6，年龄：24，工资3300
public class test2_4 {
    public static void main(String[] args) {
        Work w1 = new Work("zhang3", 18, 3000);
        Work w2 = new Work("li4", 25, 3500);
        Work w3 = new Work("wang5", 22, 3000);
        List<Work> list = new ArrayList<>();
        list.add(w1);
        list.add(w2);
        list.add(w3);
        Work w4 = new Work("zhao6", 24, 3300);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName() == "li4") {
                list.add(i, w4);
                break;
            }
        }
        list.remove(w3);
        System.out.println(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Work ww = (Work) it.next();
            ww.work();

        }

    }
}

class Work {
    private String name;
    private int age;
    private double salary;

    public void work() {
        System.out.println("年纪" + age + "岁的" + name + "开始工作了");
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Work(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Work() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Work work = (Work) o;
        return age == work.age &&
                Double.compare(work.salary, salary) == 0 &&
                name.equals(work.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }

    @Override
    public String toString() {
        return "Work{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}