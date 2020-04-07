package collection;
import java.util.*;
public class text {

	public static void main(String[] args) {
			//使用collection完成集合排序
		List l = new ArrayList();
		//添加元素
		l.add(10);
		l.add(5);
		l.add(9);
		l.add(20);
		l.add(30);
		
		Iterator i =l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		//排序
		Collections.sort(l);
		System.out.println("--------------");
		//遍历
		 i =l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Set s =new HashSet();
		
		s.add(1);//自动装箱
		s.add(10);
		s.add(9);
		s.add(8);
		s.add(7);
		
	      //将Set集合转化成List集合
		List lists = new ArrayList(s);
		
		Collections.sort(lists);
		System.out.println("----------");
		//遍历
			System.out.println(lists);
		//将ArrayList转化成线程安全的
		List mylist = new ArrayList();
		Collections.synchronizedList(mylist);
	}

}
