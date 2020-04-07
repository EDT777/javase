package com.octopus.java0716;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * 使用TCP连接下载html网页
 * @author hw
 *
 */
public class SocketHttpRequest {
	public static void main(String[] args) {
		String request = "GET / HTTP/1.1\r\n";
		request += "Host: www.baidu.com\r\n\r\n";
		try (Socket socket = new Socket("www.baidu.com", 80);){
			
			socket.getOutputStream().write(request.getBytes("UTF-8"));
			socket.getOutputStream().flush();
			InputStream is = socket.getInputStream();
			byte[] buffer = new byte[100000];
			int len = is.read(buffer);
			System.out.println(new String(buffer,0,len,"UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
