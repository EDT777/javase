package com.octopus.java0904;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * TCP协议客户端
 * 
 * @author hw
 *
 */
public class Client {
	public static void main(String[] args) {
		// 创建一个Socket并连接到服务器端
		Scanner scn = new Scanner(System.in);
		try (Socket socket = new Socket("127.0.0.1", 8888);) {

			System.out.println("客户端接入成功");
			try (OutputStream os = socket.getOutputStream(); 
					InputStream is = socket.getInputStream();) {
				while (true) {

					byte[] buffer = new byte[1024];
					int len = is.read(buffer);
					System.out.println("服务器端发送的消息为:" + new String(buffer, 0, len));
					
					System.out.print("请输入要发送的内容:");
					String message = scn.nextLine();
					os.write(message.getBytes());
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		scn.close();
	}
}
