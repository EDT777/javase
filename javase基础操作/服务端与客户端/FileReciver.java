package 服务端与客户端;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//文件接收
public class FileReciver {
		 public void startReciver() {
			 try {
				 //建立到服务器的连接
				 Socket socket =new Socket("1217.0.0.1",10001);
				 System.out.println("已经建立连接");
				 
				 byte[] buffer = new byte[40960];
				 //等待对方的文件名发送
				 socket.getInputStream().read(buffer);
				 //接收到文件名后给服务器的响应
				 String fileName = (new String(buffer,"utf-8")).trim();
				 System.out.println("接收到文件名："+fileName);
				 socket.getOutputStream().write("文件名已接收".getBytes("utf-8"));
				 //等待对方发送文件长度
				 buffer = new byte[100];//清空原理的buffer
				 socket.getInputStream().read(buffer);
				 //接收到文件名后给服务器的响应
				 String fileLength= (new String(buffer,"utf-8")).trim();
				 System.out.println("接收到文件长度:"+fileLength);
				 socket.getOutputStream().write("文件已接收".getBytes("utf-8"));
				 //开始接收文件数据
				 try(FileOutputStream fos = new FileOutputStream(fileName.substring(fileName.lastIndexOf('\\')+1));
						 InputStream is =socket.getInputStream();){
					 System.out.println("正在接收文件");
					 buffer =new byte[4096];
					 int readed =0,totalLength =0;
					 long fLength =Long.parseLong(fileLength);
					 //循环接收并输出进度信息
					 while(totalLength<fLength) {
						 readed =is.read(buffer);
						 double percent = totalLength*100.0/fLength;
						 System.out.println(String.format("完成进度：%1$4.2f%%", percent));
						 totalLength +=readed;
						 fos.write(buffer,0,readed);
					 }
					 System.out.println("接收到文件的长度"+totalLength);
					 System.out.println("文件已保存为:"+fileName);
				 }catch(Exception e) {
					 e.printStackTrace();
				 }
				 socket.close();//关闭连接
			 }catch(UnknownHostException e) {
				 e.printStackTrace();
			 
		 }catch(IOException e) {
			 e.printStackTrace();}
		 }
}
