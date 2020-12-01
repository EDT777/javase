package 第四阶段.集合框架.day01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//需求：练习LinkedList类的常用方法
//
//- void addFirst(Object e) 将指定元素插入此列表的开头。
//
//- void addLast(Object e) 将指定元素添加到此列表的结尾。
//
//- Object getFirst() 返回此列表的第一个元素。
//
//- Object getLast() 返回此列表的最后一个元素。
//
//- Object removeFirst()  移除并返回此列表的第一个元素。
//
//- Object removeLast()  移除并返回此列表的最后一个元素。
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list =new LinkedList();
        list.addFirst(1);
        list.addLast(2);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list);
        System.out.println(list.removeLast());
        System.out.println(list);
    }
}
