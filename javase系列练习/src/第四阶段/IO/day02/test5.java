package 第四阶段.IO.day02;

import java.io.*;
import java.util.Calendar;

//需求：演示对象流(ObjectOutputStream-ObjectInputStream)序列化和反序列操作
public class test5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("AKA/C/c.txt"));
//        User u = new User("小豪",22);
//        oos.writeObject(u);
//        oos.close();
        ObjectInputStream ois =new ObjectInputStream(new FileInputStream("AKA/C/c.txt"));
        Object uu =ois.readObject();
        System.out.println(uu);
        ois.close();

    }
}

class User implements Serializable {
   private final static long serialVersionUID =1L;
    private String name;
    private  int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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
        return "User{" +
                "name='" + name + '\'' +
                ", age="  +age+
                '}';
    }
}