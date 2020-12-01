package 第四阶段.集合框架.day02;

import java.util.Set;
import java.util.TreeSet;

//需求：使用Comparable接口按照用户的年龄从小到大排序
public class ComparableDemo {
    public static void main(String[] args) {
        AkaUser u1 = new AkaUser("小A", 23);
        AkaUser u2 = new AkaUser("小B", 12);
        AkaUser u3 = new AkaUser("小C", 222);
        Set<AkaUser> set =new TreeSet<>();
        set.add(u1);
        set.add(u2);
        set.add(u3);
        System.out.println(set);
    }
}

class AkaUser implements Comparable<AkaUser> {
    private String name;
    private int age;

    public AkaUser() {
    }

    public AkaUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AkaUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(AkaUser o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        } else {
            return 0;
        }
    }
}