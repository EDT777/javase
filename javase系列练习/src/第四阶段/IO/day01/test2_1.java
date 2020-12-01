package 第四阶段.IO.day01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//2）创建一个Map集合将统计文件D:/calcCharNum.txt中各个字母出现次数	。
//
//3）遍历**Map集合**并按照以下格式打印，**格式如下：“A(2),B(5),C(4),D(6),E(3),F(7)”**，括号内代表字符出现次数。
public class test2_1 {
    public static void main(String[] args) throws IOException {


        FileReader fr = new FileReader("AKA/a/hello.txt");
        char[] c = new char[1024];
        StringBuilder sb = new StringBuilder();
        int len = 0;
        while ((len = fr.read(c)) != -1) {
            sb.append(new String(c, 0, len));
        }
        Map<Character, Integer> map = toMap(sb.toString());
        System.out.println(map);
        Set<Map.Entry<Character, Integer>> entrys = map.entrySet();
        StringBuilder sbb = new StringBuilder();
        for (Map.Entry e : entrys) {
            sbb.append(e.getKey() + "(" + e.getValue() + "),");
        }
        System.out.println(sbb);
        sbb.deleteCharAt(sbb.length() - 1);
        System.out.println(sbb);
    }

    public static Map toMap(String s) {
        char[] cs = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : cs) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }
}
