package 服务器创建;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {
	
	public static boolean iswho =true;

	public static void main(String[] args) throws Exception {
		startsever();
	}

	public static void startsever() throws Exception {
		
	
		try(ServerSocket s = new ServerSocket(80);){
			System.out.println("服務器開始监听");
			while(iswho) {
				Socket socket =s.accept();
				System.out.println("服务器连接成功");
				
				System.out.println("开始解析报文-----");
					try(InputStream is =socket.getInputStream();OutputStream os =socket.getOutputStream();){
						
						request req = Utill.parserequest(is);
						if(req!=null) {
							System.out.println("解析成功，获取文件名为："+req.getpath());
							File fil = new File("D:/"+req.getpath());
							if(fil.exists()) {//返回报文格式
								response r = new response(200,"Ok",Utill.panduan(req.getpath()),new FileInputStream(fil))
							}else {//返回解析失败时报文格式
								String content = "Not Found";
								ByteArrayInputStream bis = new ByteArrayInputStream(content.getBytes());
								response r = new response(404,"Not Found","text/html",bis);
							}
							
						}else {
							System.out.println("解析失败----");
						}
						
					}catch(Exception e) {
						e.printStackTrace();
					}       
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
