package 异常;
import java.io.*;
public class Getmessage和printStackTrace {
	public static void main(String[] args) {
		
	
	try {
		FileInputStream f = new FileInputStream("asd");
	}catch(FileNotFoundException f) {
		f.printStackTrace();//此方法详细
		//String s = f.getMessage(); 此方法不那么详细
		//System.out.println(s);
	}
    System.out.print("啊么么哒");//此段代码会执行
}
}