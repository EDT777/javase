package 第四阶段.集合框架.day01;

import java.util.ArrayList;
import java.util.List;

//需求：创建四个User对象，存储在List中，分析内存图。
public class ArrayListDemo2 {
    public static void main(String[] args) {
        User u1 =new User("小A",15);
        User u2 = new User("小B",18);
        User u3 =new User("小C",22);
        User u4 = new User("小D",27);
        List list = new ArrayList();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        System.out.println(list);
        u1.name="啊啊";
        u1.age=123;
        System.out.println(list);

    }
}
class User{
   String name;
    int age;
    User(){

    }
    User(String name,int age){
         this.name=name;
         this.age=age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
