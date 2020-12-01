package 第四阶段.集合框架.day02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

//需求：演示HashSet接口中的常用操作
//增：
//
//删：
//
//改：
//
//查：
//
//遍历
public class HashSetDemo {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        map.put("4",4);
        map.put("5",5);
        System.out.println(map.get("1"));
        System.out.println(map);
        System.out.println(map.remove("1"));
        System.out.println(map);
        Set<Map.Entry<String, Object>> entrys =map.entrySet();
        for (Map.Entry<String, Object> map2 : entrys){
            System.out.println(map2.getKey()+"======>"+map2.getValue());
        }

    }
}
