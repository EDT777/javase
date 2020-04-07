package io和properties和反射机制;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class text {
	public static void main(String[] args) throws Exception {
		//创建属性对象
		Properties p = new Properties();
		//创建流
		FileReader fr = new FileReader("classInfo.properties");
		//加载
		p.load(fr);
		//关闭流
		fr.close();
		//通过key获取value
		String v = p.getProperty("className");
	//	System.out.println(v);
		
		//通过反射机制创建对象
		Class c = Class.forName(v);
		
		//创建对象
		Object o = c.newInstance();
		
		System.out.println(o);
		
		
		
	}
}
