package IO流;
import java.io.*;
public class fileoutputstream {

	public static void main(String[] args) {
			 
		
			FileOutputStream fos = null;
			try {
				//创建文件字节流
				fos = new FileOutputStream("fuzhu2");//该文件不存在则自动创建
				//开始写
				String s ="EDTaaaa";
				//将String 转化成byte数组
				byte[] bytes = s.getBytes();
				fos.write(bytes);
				//推荐最后的时候为了保证数据完全写入硬盘，所以要刷新
				fos.flush();//强行写入
			}catch(Exception e) {
				e.printStackTrace();
			}finally{
				//关闭
				if(fos!=null) {
					try {
						fos.close();
					}catch(Exception e2) {
					e2.printStackTrace();
				}
			}
			}
	}
	}


