package IO流;
import java.io.*;
public class fileinputstream3 {
//fuzhu:abcdefg
	public static void main(String[] args) throws Exception {
		//创建流
			FileInputStream fis = new FileInputStream("fuzhu");
			
			System.out.println(fis.available());//7
			
			System.out.println(fis.read());//97
			
			//int available 返回流中剩余的估计字节数
			System.out.println(fis.available());//6
			//跳过2个字节
			fis.skip(2);
			
			System.out.println(fis.read());//100
			
			//关闭
			fis.close();
			
	}

}
