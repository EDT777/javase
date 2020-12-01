package 第四阶段.集合框架.day02;

import java.util.*;

//需求：演示HashMap的迭代操作（三个）
public class HashMapDemo2 {
    public static void main(String[] args) {
        Map<String,Object> map =new HashMap<>();
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        map.put("4","d");
        map.put("5","e");
        Set set1 =map.keySet();
        System.out.println(set1);
        System.out.println( map.values());
        Set<Map.Entry<String, Object>> set3 = map.entrySet();
        for (Map.Entry e:set3){
            System.out.println(e.getKey()+"=====>"+e.getValue());
        }

    }
}
