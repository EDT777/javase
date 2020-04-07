package IO流;
import java.io.*;
public class fileinputstream2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fuzu");
		// 循环读取
		byte[] bytes =new byte[1024];//每次读取1kb
		int temp =0;
		while((temp=fis.read(bytes))!=0) {
			System.out.print(new String(bytes,0,temp));
			
		}
		
		fis.close();
	}

}
