package 第四阶段.集合框架.day02;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//需求：创建三个User对象，覆盖equals和hashCode方法，存储在HashSet中。
public class HashSetDemo2 {
    public static void main(String[] args) {
        User u1 = new User("a", 1);
        User u2 = new User("a", 1);
        User u3 = new User("b", 2);
        Set set =new HashSet<>();
        set.add(u1);
        set.add(u2);
        set.add(u3);
        System.out.println(set);

    }
}

class User {
    private String name;
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

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}