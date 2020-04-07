package IO流;
import java.io.*;
public class copy {

	public static void main(String[] args) throws Exception {
			//创建输入流
			FileInputStream fis = new FileInputStream("fuzhu");
			//创建输出流
			FileOutputStream fos = new FileOutputStream("c:/input.mdi");
					
					//一边读一边写
					byte[] bytes= new byte[1024];
			int temp = 0;
			while((temp=fis.read(bytes))!=-1) {
				//将bytes数组中内容直接写入
				fos.write(bytes,0,temp);
			}
			
			//刷新
			fos.flush();
			//关闭
			fis.close();
			fos.close();
	}

}
