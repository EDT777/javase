package com.octopus.java0716;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ����80�˿ڲ���������
 * 
 * @author hw
 *
 */
public class HttpServer {

	public static void main(String[] args) {
		startServer();
	}
	
	/**
	 * ����������
	 */
	public static void startServer() {
		boolean shouldExists = false;// ���Ʒ������Ƿ���������µ�����
		try (ServerSocket serverSocket = new ServerSocket(80);) {

			while (!shouldExists) {
				try (Socket socket = serverSocket.accept();
						InputStream is = socket.getInputStream();
						OutputStream os = socket.getOutputStream();) {

					// �����ͻ�������
					Request req = HttpUtil.parseRequest(is);
					if (req != null) {
						System.out.println("���յ�����������ļ�Ϊ:" + req.getPath());
					}else {
						continue;
					}
					// �������ݣ�������ʾ��
					Response resp = HttpUtil.processRequest(req);
					//��Ӧ����Ҫ���ؿͻ���
					HttpUtil.writeResponse(os, resp);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
