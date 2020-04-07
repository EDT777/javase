package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
	//	Student stu = new Student();
		// 方法1
		/*
		 * Class stuClass = stu.getClass(); System.out.println(stuClass);
		 */
		// 方法2
		// Class stuClass = Student.class;
		// 方法3
		Class stuClass = null;
		try {
			stuClass = Class.forName("反射.Student");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//获取所有的公共构造函数
		/*
		 * for(Constructor constructor:stuClass.getConstructors()) {
		 * System.out.println(constructor); }
		 */
		//获取所有构造函数
		/*
		 * for(Constructor constructor:stuClass.getDeclaredConstructors()) {
		 * System.out.println(constructor); }
		 */
		Constructor constructor=null;
		
		try {
			//获取无参构造
//			constructor = stuClass.getConstructor(null);
		//获取一参构造函数
		//	constructor =stuClass.getConstructor(String.class);
		//获取私有构造函数
			constructor = stuClass.getDeclaredConstructor(String.class,Integer.class,String.class );
			System.out.println(constructor);
			//生成对象
			//暴力提升访问级别
			constructor.setAccessible(true);
			Object obj =constructor.newInstance("A001",2,"Jory");
			System.out.println(obj);
			
			System.out.println("=========fields==========");
			//获取所有public属性列表
//			for(Field field :stuClass.getFields()) {
//				System.out.println(field);
//			}
//			//获取所有属性列表
//			for(Field field :stuClass.getDeclaredFields()) {
//				System.out.println(field);
//			}
//			Field field =stuClass.getField("schoolNo");
			
//			Field field =stuClass.getDeclaredField("classNO");
			Field field =stuClass.getSuperclass().getDeclaredField("name");
			System.out.println(field);
			
			field.setAccessible(true);
			//设置成员属性值
			field.set(obj, "EDT");
			//获取成员属性值
			System.out.println(field.get(obj));
			
			System.out.println("=======method=======");
			//获取所有公共方法(包括父类)
//			for(Method method:stuClass.getMethods()) {
//				System.out.println(method);
//			}
			
			//获取所有方法(不包括父类，仅限本类)
//			for(Method method:stuClass.getDeclaredMethods()) {
//				System.out.println(method);
//			}
			//获取指定方法
			Method method = stuClass.getMethod("method1", String.class);
			System.out.println(method);
			//调用方法
			method.setAccessible(true);
			method.invoke(obj, "test");
			//调用静态方法
			//method.invoke(null); 不需要传实例对象
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
