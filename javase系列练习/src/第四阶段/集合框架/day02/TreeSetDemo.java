package 第四阶段.集合框架.day02;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//需求：演示TreeSet接口中的常用操作
//
//增：
//
//删：
//
//改：
//
//查：
//
//遍历
public class TreeSetDemo {
    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add(2);
        set.add(4);
        set.add(1);
        set.add(6);
        System.out.println(set);
        set.remove(2);
        System.out.println(set);
        Iterator it =set.iterator();
        while (it.hasNext()){
            Object o =it.next();
            if(o==Integer.valueOf(6)){
                it.remove();
                set.add(7);

            }

        }

        System.out.println(set);

    }
}
