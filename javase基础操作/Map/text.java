package Map;

import java.util.*;
/*Map中常用的方法
void clear(); 清空Map
boolean containsKey(Object Key); 判断Map中是否包含这样的Key
boolean containsValue(Object value);判断Map中是否包含这样的value

Set<Map.Entry<K,V>> entrySet()
				返回此映射中包含的映射关系的Set 视图。
Object get(Object key);通过Key获取value 
Object put(Object key,Object value);向集合中添加键值对

 boolean isEmpty();判断集合是否为空
 object remove(Object key);通过key将键值对删除
 int size();获取map中键值对的个数
 
 Set keySet();获取Map中所有的key
 Collection values();获取Map集合中所有的value
*/
public class text {

	public static void main(String[] args) {
		//1.创建map集合
		Map persons = new HashMap();//HashMap的默认初始化容量是16，默认加载因子是0.75
		
		//2.
		persons.put("10000","jack");
		persons.put("10001","jac2");
		persons.put("10002","jac3");
		persons.put("10003","jac4");
		persons.put("10004","jac5");
		persons.put("10000","jac6");
		//3.判断键值对个数
		//Map中的key 是无序不可重复的。和HashSet相同。
		System.out.println(persons.size());//5
		//判断集合中是否存在这样的key
		System.out.println(persons.containsKey("10000"));//true
		//判断集合中是否存在这样的value
		System.out.println(persons.containsValue("jac6"));//true
		
		//通过key获取value
		String k="10001";
		Object v =persons.get(k);
		System.out.println(v);//jac2
		//通过key删除键值对
		persons.remove("10001");
		System.out.println(persons.size());//4
		//获取所有的value
		Collection 	values =persons.values();
		Iterator it =values.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//获取所有的key
		Set s = persons.keySet();
		Iterator i =s.iterator();
		while(i.hasNext()) {
			Object key = i.next();
			Object value = persons.get(key);
			System.out.println(key+"--->"+value);
		}
		//entrySet
		//将map转化成set集合
		Set entryset = persons.entrySet();
		Iterator i1 = entryset.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}
