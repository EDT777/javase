package 第四阶段.集合框架.day01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//需求：练习ArrayList类的常用方法
public class ArrayListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list.add(1));
        list.add(1,3);
        System.out.println(list);
        List list2 = new ArrayList();
        list2.add("啊啊啊");
        list2.add("哈哈哈");
        System.out.println(list.addAll(list2));
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);
        System.out.println("111");
        System.out.println(list.set(1,3));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.get(0));
        System.out.println(list.toArray());
        System.out.println(list.contains(1));
    }
}
