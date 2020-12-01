package 第四阶段.集合框架.day01;

import java.util.ArrayList;
import java.util.List;

//需求：模拟篮球球员上场
//
//- 初始一个容量为5的容器，用来存储场上的5个球衣号码。
//
//- 安排5个球员上场，比如球员号码分别为11、22、33、44、55。
//
//- 查询指定索引位置球员的球衣号码是多少，如查询索引位置为2的球衣号码是33。
//
//- 替换场上索引位置为2的球员，使用333号替换33号。
//
//- 罚下场上索引位置为2的球员（直接罚下，没有补位）。
//
//- 打印出场上球员的球衣号码，打印风格如 [11，22，33，44，55]。
public class PlayerList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        System.out.println("索引2的位置是"+list.get(2));
        list.set(2,333);
        System.out.println(list.get(2));
        list.remove(2);
        System.out.println(list);
    }
}
