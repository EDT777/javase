package com.octopus.java0904;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 演示如何创建一个tcp服务端
 * 
 * @author hw
 *
 */
public class Server {
	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(8888); 
				Scanner scn = new Scanner(System.in);) {

			System.out.println("服务器准备接入连接");
			// 真正等待接入的代码
			Socket socket = server.accept();
			// 上述代码得到的socket对象代表的是服务器和将来的客户端建立的通道（套接字）

//			System.out.println("得到客户端连接:" + socket);
			// 发送数据给客户端
			
			try (OutputStream os = socket.getOutputStream(); 
					InputStream is = socket.getInputStream();) {
				while (true) {
					System.out.print("请输入要发送的内容:");
					String message = scn.nextLine();
					os.write(message.getBytes());

					byte[] buffer = new byte[1024];
					int len = is.read(buffer);
					System.out.println("客户端发送的消息为:" + new String(buffer, 0, len));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
