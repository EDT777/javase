package 集合练习;

import java.text.Collator;
import java.util.*;
import java.util.Map.Entry;

public class 集合排序对象 {

	public static void main(String[] args) {

		Ren ren1 = new Ren("001", "张三", 21);
		Ren ren2 = new Ren("002", "王五", 22);
		Ren ren3 = new Ren("003", "李四", 20);
		Ren ren4 = new Ren("004", "赵七", 23);
		Ren ren5 = new Ren("005", "刘六", 21);

		List list = new ArrayList();
		list.add(ren1);
		list.add(ren2);
		list.add(ren3);
		list.add(ren4);
		list.add(ren5);
		Collections.sort(list, new xuehao());

		System.out.println("*******按学号排序的学生信息*******");
		System.out.println("学号  姓名 年龄");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o.toString());
		}

		Collections.sort(list, new name());

		System.out.println("*******按姓名排序的学生信息*******");
		System.out.println("学号  姓名 年龄");
		Iterator it1 = list.iterator();
		while (it1.hasNext()) {
			Object o = it1.next();
			System.out.println(o.toString());
		}
		Collections.sort(list, new age());

		System.out.println("*******按年龄排序的学生信息*******");
		System.out.println("学号  姓名 年龄");
		Iterator it2 = list.iterator();
		while (it2.hasNext()) {
			Object o = it2.next();
			System.out.println(o.toString());
		}

	}

}

class Ren {

	public String xuehao;
	public String name;
	public int age;

	public Ren(String xuehao, String name, int age) {
		this.xuehao = xuehao;
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return xuehao + " " + name + " " + age;
	}
}

class name implements Comparator<Ren> {
	private static Collator collator =Collator.getInstance(Locale.CHINA);
	
	public int compare(Ren o, Ren o2) {
		// TODO Auto-generated method stub
		return collator.compare(o.name, o2.name);
	}
}

class xuehao implements Comparator<Ren> {

	public int compare(Ren o, Ren o2) {
		// TODO Auto-generated method stub
		return o.xuehao.compareTo(o2.xuehao);
	}
}

class age implements Comparator<Ren> {

	public int compare(Ren o, Ren o2) {
		// TODO Auto-generated method stub
		return o.age - o2.age;
	}

}
