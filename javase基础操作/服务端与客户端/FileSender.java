package 服务端与客户端;

import java.io.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;
import java.net.*;

//使用TCP编程实现文件发送，参考程序流程如下：
//参考运行效果为（依次为发送端、接收端）：
public class FileSender {
	public static final int BUFFER_LENGTH=4096;
	//  开始发送文件，发送内容在filelist集合中，通过addfile添加文件
	 public void startsend() throws Exception {
		 byte[] buffer =new byte[BUFFER_LENGTH];
		 try(ServerSocket serverSocket=new ServerSocket(10001)) {
			 while(!shouldStop) {
				 //发送数据
				 if(fileList.size()==0) {//fileList是要发送文件名集合
					 System.out.println("文件发送完毕");
					shouldStop = true;
				 }else {
					 //accept()后 程序进入等待状态
					 System.out.println("等待接入...");
					 Socket socket = serverSocket.accept();
					 //接受一个连接
					 System.out.println(socket.getRemoteSocketAddress()+"已经接入.");
					 //发送文件名过去
					 String fileName =(String) fileList.remove(0);//取一个文件名
					 byte[] bufferName = fileName.getBytes("utf-8");//将文件名转成字节以便发送
					 System.out.println("文件名字节长度为："+bufferName.length);
					 socket.getOutputStream().write(bufferName);//发送文件名
					 System.out.println("已发送文件名"+fileName);
					 //获得对方相应
					 socket.getInputStream().read(buffer);//等待读取响应
					 //将读取到的数据按照对应编码utf-8转换为字符串
					 String answer = (new String(buffer,"utf-8")).trim();
					 if(!answer.equals("文件名已接收")) {
						 System.out.println("对方响应不正确");
						 socket.close();//关闭这个连接
						 continue;//放弃当前操作，直接等待下一个连接
					 }
					 
					 //发送文件长度
					 String fileLength = new File(fileName).length()+"";
					 bufferName = fileLength.getBytes("utf-8");
					 socket.getOutputStream().write(bufferName);
					 System.out.println("已经发送文件长度"+fileLength);
					 //获得对方响应
					 int len = socket.getInputStream().read(buffer);
					 answer = (new String (buffer,0,len,"utf-8")).trim();
					 if(!answer.equals("文件长度已接收")) {
						 System.out.println("对方响应不正确");
						 socket.close();//关闭这个连接
						 continue;//放弃当前操作，直接等待下一个连接
					 }
					 //发送文件内容
					 try(FileInputStream fis = new FileInputStream(fileName);OutputStream os = socket.getOutputStream();){
						 int filelen = fis.available();
						 
						 System.out.println("开始发送文件长度"+filelen);
						 while(true) {
							 len = fis.read(buffer);
							 if(len>0) {
								 os.write(buffer,0,len);
								 os.flush();
							 }else {
								 break;
							 }
						 }
						 System.out.println("文件"+ fileName +"发送完毕");
						 
					 }catch(Exception e) {
						 e.printStackTrace();
					 }
							 
				 }
			 }
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
	 }
	 
	 private boolean shouldStop = false ;
	 
	 private List fileList = new ArrayList();
	 
	 //添加一个待发送文件
	 
	 public void addFile(String fileName) {
		 fileList.add(fileName);
	 }
	 
	 //在完成当前文件发送后退出，不管实际还有多少文件发送
	 public void stopListener() {
		 this.shouldStop = true;
	 }
	 
	 public static void main(String[] args) throws Exception {
		 FileSender sender = new FileSender();
		 sender.addFile("D:\\123.jar");
		 sender.startsend();
	 }
}
