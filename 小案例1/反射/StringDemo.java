package 反射;

import java.lang.reflect.Field;

public class StringDemo {
	public static void main(String[] args) {
		String s1 ="abcf";
		String s2 ="dasf";
		Class c = String.class;
		try {
			Field field =c.getDeclaredField("value");
			field.setAccessible(true);
			field.set(s1, "123".toCharArray());
			System.out.println(s1);
			System.out.println(s2);
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}	
