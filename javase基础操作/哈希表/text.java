package 哈希表;
import java.util.*;
/*set集合：HashSet
 * 1.HashSet底层实际是一个HashMap,HashMap底层采用了哈希表数据结构。
 * 2.哈希表又叫做散列表，哈希表底层是一个数组中每一个元素是一个单向链表。
 * 每个单向链表都有一个独一无二的hash值，代表数组的下标。
 * 在某个单向链表中的每一个节点上的hash值相等的。hash值实际上是Key调用hashCode方法
 * 再通过"hash function"转化成值
 * 3.如何向哈希表中添加元素：
 * 先调用被存储的Key的hashcode方法，经过某个算法得出hash的值，如果在这个哈希表不存在这个hash值
 * 则直接加入元素，如果该hash值已经存在，继续调用key之前的equals方法，如果equals方法返回false,则将
 * 该元素添加，返回true则放弃添加
 * 4.HashSet其实是HashMao中的key部分，HashSet有什么特点，Hashmao中的key应该具有相同特点
 * 5.HashSet和HashMap的初始化容量都是16 ，默认加载因子是0.75
 * */
public class text {

	public static void main(String[] args) {
		//创建Set集合
		Set s = new HashSet();
		//无序不可重复
		s.add(1);
		s.add(1);
		s.add(2);
		s.add(33);
		s.add(4);
		//遍历
		Iterator i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
