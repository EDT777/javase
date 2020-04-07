package properties;
import java.util.*;
public class text {

	public static void main(String[] args) {
			//创建属性类对象
		Properties p = new Properties();
		//存 
		//注意key不能重复，如果重复则value覆盖
		p.setProperty("100", "ABC");
		p.setProperty("101", "ABd");
		p.setProperty("102", "ABe");
		p.setProperty("103", "ABr");
		
		//取，通过key获取value
		String v1 = p.getProperty("100");
		String v2 = p.getProperty("101");
		String v3 = p.getProperty("102");
		String v4 = p.getProperty("103");
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		
	}

}
