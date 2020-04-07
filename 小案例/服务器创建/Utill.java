package 服务器创建;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Utill {
		 static request req =null;
		public static request parserequest(InputStream is) throws Exception {
			try {
			while(is.available()<=0) {
				try {
				Thread.sleep(1);
				}catch(Exception e) {
					e.printStackTrace();
				}
				}
			//字节流转化成字符流
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String s =br.readLine();
			//获取第一个空格下标位
			int index1 =s.indexOf(' ');
			//获取第二个空格下标位
			int index2=s.indexOf(' ',index1+1);
			if(index1>-1&index2>-1) {
			String s1 =s.substring(index1+1,index2);
			int index3 =s1.indexOf('?');
			if(index3>-1) {
				//去掉？之后的信息
				s1=s1.substring(0,index3);
			}
			req =new request(s1);
			
			}else {
				System.out.println("未能解析成功");
			}
		
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return req;
			}
		
			//判断什么类型
		public static String panduan(String s) {
			String s1=" ";
			if(s.endsWith(".html")) {
				s1="text/html";
			}
			else if(s.endsWith(".jpg")){
				 s1="imag/jpg";
			}else if(s.endsWith(".gif")){
				s1="imag/gif";
			}else if(s.endsWith(".png")){
				s1="imag/png";
			}else if(s.endsWith(".js")){
				 s1="text/javascript";
			}
			return s1;
		}
		//返回报文给客户端
		public void send(response r,OutputStream os ) throws Exception {
			String s1="Http/1.1 "+r.getCode()+" "+r.getState()+"\r\n";
			os.write(s1.getBytes());
			SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM ddHH:mm:ss 'GMT' yyyy", Locale.US);
			String dateHeader = "Date: " + sdf.format(new Date()) + "\r\n";
			os.write(dateHeader.getBytes());
			String contentType = "Content-Type: " + r.getContentType() + "\r\n";
			os.write(contentType.getBytes());
			String contentLength = "Content-Length: " + r.getIs().available() + "\r\n";
			os.write(contentLength.getBytes());
			String serverInfo =
					"Server: OctopusServer\r\n";
			os.write(serverInfo.getBytes());
			os.write("\r\n".getBytes());
			
			byte[] buffer = new byte[4096];
			int len=0;
			while((len=r.getIs().read(buffer))>0){
				os.write(buffer,0,len);
			}
			os.flush();
		}
		}


