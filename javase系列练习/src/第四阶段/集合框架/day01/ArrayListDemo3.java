package 第四阶段.集合框架.day01;

import java.util.ArrayList;
import java.util.List;

//需求：使用泛型创建ArrayList类对象，并调用ArrayList中的增删改查方法
//
//作业目的：掌握泛型类的基本使用
public class ArrayListDemo3 {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        System.out.println(list);
        list.set(1,123321);
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list);

    }
}
