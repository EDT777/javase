package 第四阶段.集合框架.day02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//需求：调用HashMap的常用方法
//
//**添加操作**
//
//- boolean put(Object key,Object value)：存储一个键值对到Map中
//
//- boolean putAll(Map  m)：把m中的所有键值对添加到当前Map中
//
//**删除操作**
//
//- Object remove(Object key)：从Map中删除指定key的键值对，并返回被删除key对应的value
//
//**修改操作**
//
//- 无专门的方法，可以调用put方法，存储相同key，不同value的键值对，可以覆盖原来的。
//
//**查询操作**
//
//- int size()：返回当前Map中键值对个数
//
//- boolean isEmpty()：判断当前Map中键值对个数是否为0.
//
//- Object get(Object key)：返回Map中指定key对应的value值，如果不存在该key，返回null
//
//- boolean containsKey(Object key):判断Map中是否包含指定key
//
//- boolean containsValue(Object value):判断Map中是否包含指定value
//
//- Set keySet()：返回Map中所有key所组成的Set集合
//
//- Collection values()：返回Map中所有value所组成的Collection集合
//
//- Set<Entry> entrySet()：返回Map中所有键值对所组成的Set集合
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        Map<String, Object> mmp = new HashMap<>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        mmp.put("4","d");
        mmp.putAll(map);
        System.out.println(mmp);
        mmp.remove("2");
        System.out.println(mmp);
        mmp.put("1","aa");
        System.out.println(mmp);
        System.out.println(mmp.size());
        System.out.println(mmp.isEmpty());
        System.out.println(mmp.get("1"));
        System.out.println(mmp.containsKey("1"));
        System.out.println(mmp.containsValue("d"));
        System.out.println(mmp.values());
        Set<Map.Entry<String, Object>> set =mmp.entrySet();
      Set et =mmp.keySet();
        System.out.println(et);
        for (Object o: set){
            System.out.println(o);
        }
    }
}
