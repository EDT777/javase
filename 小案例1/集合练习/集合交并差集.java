package 集合练习;

import java.util.*;

//编写代码实现输出两个list集合的并集，交集，差集
//原集合1：[1,2,3,4,5]
//原集合2:[4,5,6,7,8,9]
//集合交集:[4,5]
//集合并集:[1,2,3,4,5,6,7,8,9]
//集合差集:[1,2,3,6,7,8,9]
public class 集合交并差集 {

	public static void main(String[] args) {
			List s1 =new ArrayList();
			List s2 =new ArrayList();
			
		
		
			s1.add(1);
			s1.add(2);
			s1.add(3);
			s1.add(4);
			s1.add(5);
			List s11 = new ArrayList(s1);
			List s111 = new ArrayList(s1);
			List s1111 = new ArrayList(s1);
			System.out.println("原集合1："+s1);
			s2.add(4);
			s2.add(5);
			s2.add(6);
			s2.add(7);
			s2.add(8);
			s2.add(9);
			List s22 = new ArrayList(s2);
			List s222 = new ArrayList(s2);
			System.out.println("原集合2："+s2);
			//集合交集
			s1.retainAll(s2);
			System.out.println("集合交集："+s1);
			
			
			s11.addAll(s22);
			System.out.println("集合并集："+s11);
			
			s111.removeAll(s222);
			
			s222.removeAll(s1111);
			s111.addAll(s222);
			System.out.println("集合差集："+s111);
			
			
			
			
	}

}
