package 第四阶段.集合框架.day02;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//使用Comparator接口根据用户的名字长度排序，如果名字相同按照年龄排序。
public class ComparatorDemo {
    public static void main(String[] args) {
        AkbUser u1=new AkbUser("AAAA",123);
        AkbUser u2=new AkbUser("BB",2);
        AkbUser u3=new AkbUser("CCCC",27);
        Set set =new TreeSet(new AkaComparator());
        set.add(u1);
        set.add(u2);
        set.add(u3);
        System.out.println(set);
    }
}
class AkbUser {
    private String name;
    private int age;

    public AkbUser() {
    }

    public AkbUser(String name, int age) {
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


}
class AkaComparator implements Comparator<AkbUser>{



    @Override
    public int compare(AkbUser o1, AkbUser o2) {
       if (o1.getName().length()>o2.getName().length()){
           return 1;
       }else if(o1.getName().length()<o2.getName().length()){
           return -1;
       }else {
           if (o1.getAge()>o2.getAge()){
               return 1;
           }else if(o1.getAge()<o2.getAge()){
               return -1;
           }else {
               return 0;
           }
       }
    }
}