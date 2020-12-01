package 第四阶段.集合框架.day02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//演示List迭代的三种方式
public class ListDemo {
    public static void main(String[] args) {
        List list =new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
        for (Object i:list) {
            System.out.print(i);
        }
        System.out.println();
        Iterator it =list.iterator();
        while (it.hasNext()){
            Object o =it.next();
            System.out.print(o);
        }
    }
}
