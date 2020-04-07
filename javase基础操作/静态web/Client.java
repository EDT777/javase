package com.octopus.java0904;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * TCPЭ��ͻ���
 * 
 * @author hw
 *
 */
public class Client {
	public static void main(String[] args) {
		// ����һ��Socket�����ӵ���������
		Scanner scn = new Scanner(System.in);
		try (Socket socket = new Socket("127.0.0.1", 8888);) {

			System.out.println("�ͻ��˽���ɹ�");
			try (OutputStream os = socket.getOutputStream(); 
					InputStream is = socket.getInputStream();) {
				while (true) {

					byte[] buffer = new byte[1024];
					int len = is.read(buffer);
					System.out.println("�������˷��͵���ϢΪ:" + new String(buffer, 0, len));
					
					System.out.print("������Ҫ���͵�����:");
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
