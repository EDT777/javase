package IO流;
import java.io.*;
//文件字符输入流
public class filereader1 {
public static void main(String[] args) {
	
	FileReader fr=null;
	
	try {
		//创建文件字符输入流
		 fr = new FileReader("filereader.java");
		 //开始读
		 char[] chars=new char[512];
		 int temp=0;	
		 while((temp=fr.read(chars)) != -1) {
			 System.out.print(new String(chars,0,temp));
		 }
	}catch(Exception e){
		e.printStackTrace();
	}finally {
		if(fr!=null) {
			try {
				fr.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
					
		}
	}

}
}
