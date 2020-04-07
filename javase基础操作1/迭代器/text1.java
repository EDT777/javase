package 迭代器;

import java.util.*;

public class text1 {

	public static void main(String[] args) {
			//创建集合对象
		Collection c = new ArrayList();
		//添加元素
		c.add(100);//自动装箱
		c.add(3.14);//自动装箱
		c.add(false);//自动装箱
		
		//迭代，遍历
		//1.获取迭代器对象
		//不需要关心底层集合的具体类型，所有集合依赖的迭代器都实现了java.util.Iterator;接口.
		Iterator it = c.iterator();//迭代器是面向接口编程的
		//it是引用，保存了内存地址，指向堆中的“迭代器对象”
		
		//java.util.LinkedList$ListItr类是LinkeList集合所依赖的迭代器
		//java.util.AbstractList$Itr 类是ArrayList集合所依赖的迭代器
		//System.out.println(it);//java.util.LinkedList$ListItr@de6ced
		                         //java.util.AbstractList$Itr@de6ced
		
		//2.开始调用方法，完成遍历，迭代
		
		while(it.hasNext()){
		Object element = it.next();
		System.out.println(element);
	}
		/*boolean b =it.hasNext();判断是否有更多的元素，如果有返回true
		Object o =it.next();将迭代器向下移动一位，并且取出指向的元素
		原则：调用it.next()方法之前必须调用it.hasnext();
		*/
		//for循环
		for(Iterator it1 =c.iterator();it1.hasNext();) {
			Object o =it1.next();
			System.out.println(o);
		}
	}

	

}
