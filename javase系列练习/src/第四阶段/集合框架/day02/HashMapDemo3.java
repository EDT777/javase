package 第四阶段.集合框架.day02;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo3 {
    public static void main(String[] args) {
        String s="ASDFDSASDSASDFDADFASFGGF";
        char[] cs= s.toCharArray();
        Map<Character,Integer> map =new HashMap<>();
        for (char c:cs){

            if (map.containsKey(c)){
                Integer i=  map.get(c);
                map.put(c,i+1);
            }else {
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
