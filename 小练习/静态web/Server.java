package com.octopus.java0904;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * ��ʾ��δ���һ��tcp�����
 * 
 * @author hw
 *
 */
public class Server {
	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(8888); 
				Scanner scn = new Scanner(System.in);) {

			System.out.println("������׼����������");
			// �����ȴ�����Ĵ���
			Socket socket = server.accept();
			// ��������õ���socket���������Ƿ������ͽ����Ŀͻ��˽�����ͨ�����׽��֣�

//			System.out.println("�õ��ͻ�������:" + socket);
			// �������ݸ��ͻ���
			
			try (OutputStream os = socket.getOutputStream(); 
					InputStream is = socket.getInputStream();) {
				while (true) {
					System.out.print("������Ҫ���͵�����:");
					String message = scn.nextLine();
					os.write(message.getBytes());

					byte[] buffer = new byte[1024];
					int len = is.read(buffer);
					System.out.println("�ͻ��˷��͵���ϢΪ:" + new String(buffer, 0, len));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
