package web服务器.src.com.octopus.java0906;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.Buffer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * ��������Ľ�������Ӧ�ķ��͡��ļ����ͺ�Content-typeͷ�Ķ�Ӧ
 * 
 * @author hw
 *
 */
public class HttpUtil {

	/**
	 * �������󣬷��������һ�е����ݲ���ȡ���е�����·��
	 * 
	 * @param is
	 * @return
	 */
	public static Request parseRequest(InputStream is) {
		Request req = null;
		try {
			// �ȴ��ͻ�����������������
			while (is.available() <= 0) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
				}
			}
			// ��ʼ��ȡ��һ��
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader bfr = new BufferedReader(isr);

			String firstLine = bfr.readLine();
//			System.out.println("���յ��������У�" + firstLine);
			// ������·��
			int index1 = firstLine.indexOf(' ');
			int index2 = firstLine.indexOf(' ', index1 + 1);
			if (index1 > -1 && index2 > -1) {
				//����ͷ�еĵ�һ���ո�͵ڶ����ո�֮�����������Դ·��
				String requestPath = firstLine.substring(index1 + 1, index2);
				//?���治��·�������������
				int index3 = requestPath.indexOf('?');
				if(index3>-1) {
					requestPath = requestPath.substring(0,index3);
				}
				req = new Request(requestPath);
				

			} else {
				System.out.println("���������");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return req;
	}

	/**
	 * �����ļ���չ�������������ʶ���ļ����ݸ�ʽ(MIME)
	 * 
	 * @param fileName
	 * @return
	 */
	public static String getContentTypeByFile(String fileName) {
		String contentType = "application/octet-stream";
		if (fileName.endsWith(".html")) {
			contentType = "text/html";
		} else if (fileName.endsWith(".jpg")) {
			contentType = "image/jpeg";
		} else if (fileName.endsWith(".png")) {
			contentType = "image/png";
		} else if (fileName.endsWith(".gif")) {
			contentType = "image/gif";
		} else if (fileName.endsWith(".css")) {
			contentType = "text/css";
		} else if (fileName.endsWith(".js")) {
			contentType = "text/javascript";
		}
		return contentType;
	}

	/**
	 * ����Ӧ�����Ӧ�����ݷ��͸��ͻ��ˣ��������������HTTP��Ӧ���ĸ�ʽ��
	 * 
	 * @param resp
	 * @param os
	 */
	public static void sendResponse(Response resp, OutputStream os) {

		try {
			// д��һ��
			String firstLine = "HTTP/1.1 " + resp.getCode() + " " + resp.getState() + "\r\n";
			os.write(firstLine.getBytes());
			
			// дheader����
			// 1����������
			SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM ddHH:mm:ss 'GMT' yyyy", Locale.US);
			String dateHeader = "Date: " + sdf.format(new Date()) + "\r\n";
			os.write(dateHeader.getBytes());
			// 2�����������ݵ�contentType
			String contentType = "Content-Type: " + resp.getContentType() + "\r\n";
			os.write(contentType.getBytes());
			// 3�����ݳ���
			String contentLength = "Content-Length: " + resp.getContent().available() + "\r\n";
			os.write(contentLength.getBytes());
			// 4��������������Ϣ
			String serverInfo =
					"Server: OctopusServer\r\n";
			os.write(serverInfo.getBytes());
			// д����
			os.write("\r\n".getBytes());
			// д����
			byte[] buffer = new byte[4096];
			int len = 0;
			while((len = resp.getContent().read(buffer))>0) {
				os.write(buffer,0,len);
			}
			os.flush();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}
}
