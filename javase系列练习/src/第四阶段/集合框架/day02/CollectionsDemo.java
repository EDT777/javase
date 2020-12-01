package 第四阶段.集合框架.day02;

import java.util.*;

//需求：调用Arrays和Collections工具类中的常用方法
public class CollectionsDemo {
    public static void main(String[] args) {
        int[] a = {1, 4, 2, 5, 2, 43};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a, 4));
        List list2=Collections.EMPTY_LIST;
        List list =new ArrayList();
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
