package web服务器.src.com.octopus.java0906;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ����������������ӣ�Ȼ�����ӽ���HttpUtil�����������ļ���������ʹ�����Ӧ
 * 
 * @author hw
 *
 */
public class HttpServer {

	public static int PORT = 80;

	public static boolean isAlive = true;

	public static String rootPath = "d:/www";

	public static void main(String[] args) {
		startServer();
	}

	/**
	 * ����������
	 */
	public static void startServer() {
		try (ServerSocket server = new ServerSocket(PORT)) {
			System.out.println("�������ѿ�ʼ����");
			while (isAlive) {

				Socket socket = server.accept();// ������
				try (InputStream is = socket.getInputStream(); 
						OutputStream os = socket.getOutputStream()) {
					Response resp = null;
					// һ���������ӣ���������Ҫ��ȡ��������͵����ݲ�������һ��
					Request request = HttpUtil.parseRequest(is);
					if (request != null) {
						System.out.println("�õ�����:" + request.getPath());
						// �Ա��ļ�,����ļ��Ƿ����
						File file = new File(rootPath + request.getPath());
						if (file.exists()) {
							// ������ļ�����Ӧ����ʽ���������
							resp = new Response(200, "OK", HttpUtil.getContentTypeByFile(request.getPath()),
									new FileInputStream(file));

						} else {
							// ����������������:�ļ�������
							// ���������������������ʽ����
							System.out.println(request.getPath()+"�������Դ������");
							String content = "Not Found";
							ByteArrayInputStream bis = new ByteArrayInputStream(content.getBytes());
							resp = new Response(404, "Not Found", "text/html", bis);
						}
					} else {
						System.out.println("�������ʧ��");
						// ���������������������ʽ����
						String content = "Bad Request";
						ByteArrayInputStream bis = new ByteArrayInputStream(content.getBytes());
						resp = new Response(400, "Bad Request", "text/html", bis);

					}
					// ʵ�ʷ�����Ӧ����
					HttpUtil.sendResponse(resp, os);

				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
