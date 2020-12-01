package 第四阶段.集合框架.day02;

import java.util.ArrayList;
import java.util.List;

//需求：演示List中的并发修改异常
public class ListDemo2 {
    public static void main(String[] args) {
        List list =new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Object o:list) {
            list.remove(o);
        }

    }
}
