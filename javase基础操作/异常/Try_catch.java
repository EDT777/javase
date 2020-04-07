package 异常;

import java.io.*;

//处理异常的第二种方法：捕捉.. try...catch..
/*
		try {
		
			可能出现的异常代码;
			
		}catch(异常类型 变量) {
		
			处理异常代码;
			
		}catch(异常类型2 变量) {
		
			处理异常代码;
		}.....
		
		catch语句块可以写多个 但必须是从上到下 从小类型异常到大类型异常
		//try catch 最多执行一个catch语句块
		 * 
		 */
		 
		

public class Try_catch {

	public static void main(String[] args) {
		try {//执行到此处发生了FileNotFoundException类型的异常
			//jvm会自动创建一个FileNotFoundException类型对象。将该对象内存地址赋值给catch语块中e变量
			FileInputStream f = new FileInputStream("abc");
			
			//上面代码出现了异常。try语句块代码不再继续执行，直接进入catch语句块中执行
			System.out.println("呵呵哒");//此代码不执行
			f.read();
			}catch(FileNotFoundException e) {//e内存地址指向堆中的那个对象是"FileNotFoundExceptionl类型的"事件
				System.out.println("读取文件不存在");
				//FileNotFoundException重写了object中的tostring方法重写
				System.out.println(e);
			}catch(IOException e) {//大类型异常
				System.out.println("其他IO异常");
			}
		System.out.println("么么哒");
	}

}
