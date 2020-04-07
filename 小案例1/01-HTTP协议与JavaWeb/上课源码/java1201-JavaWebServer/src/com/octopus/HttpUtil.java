package com.octopus;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.octopus.dao.UserInfoDAO;
import com.octopus.dao.impl.UserInfoDAOImpl;
import com.octopus.entity.UserInfo;

/**
 * ʵ��HTTPЭ��Ļ�������
 * 
 * @author hw
 *
 */
public class HttpUtil {

	private static final String HTTP_1_1_404_NOTFOUND = "HTTP/1.1 404 NOTFOUND\r\n";
	private static final String HTTP_1_1_200_OK = "HTTP/1.1 200 OK\r\n";
	private static final int HTTP_STATUS_OK = 200;
	public static String rootPath = "d:/code/www";

	/**
	 * �������󣺻�ȡ�û���Ҫ����Դ��·��
	 * 
	 * @param is
	 * @return
	 */
	public static Request parseRequest(InputStream is) {
		try {
			// ��������תΪ��ͨ�ķ���������
			ByteArrayOutputStream bos = new ByteArrayOutputStream(is.available());

			int num = 0;
			while (is.available() == 0 && num++ < 2000) {
				Thread.sleep(1);
			}

			while ((is.available() > 0)) {

				bos.write(is.read());
			}

			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			// �ٶ�ȡ
			InputStreamReader reader = new InputStreamReader(bis);
			BufferedReader bfr = new BufferedReader(reader);
			// �����ַ����������Ҳ���ǵ�һ����
			String line = bfr.readLine();
			if (line == null) {
				return null;// ����һ���޷�����������
			}
			String[] words = line.split(" ");
			String path = words[1];
			Request req = null;
			if (path.indexOf('?') > 0) {
				// �õ�����
				String params = path.substring(path.indexOf('?') + 1);
				path = path.substring(0, path.indexOf('?'));
				req = new Request(path);
				// �����Ĵ�����̣�&�ָ��˶������
				String[] paramsArr = params.split("&");
				for (String p : paramsArr) {
					int eqIndex = p.indexOf('=');// �����ź�˫������ʲô����
					if (eqIndex > -1) {
						System.out.println("��ȡ��һ���ύ�Ĳ���:" + p.substring(0, eqIndex) + ",ֵΪ:" + p.substring(eqIndex + 1));
						req.getParams().put(p.substring(0, eqIndex),p.substring(eqIndex + 1));
					} else {
						System.out.println("��ȡ��һ���޲���ֵ�Ĳ���:" + p);
						req.getParams().put(p, null);//���putһ��null������������������Ƿ��ύ�˸ò���
					}
				}

			}

			return req;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * ���շ���������Ҫ���ļ������򷵻��ļ����򷵻ش�����Ϣ���������󴴽���Ӧ����Ӧ����
	 * 
	 * @return
	 */
	public static Response processRequest(Request req) {
		// ��ȡ�����е��ļ�·��
		String path = req.getPath();
		// ����ļ��Ƿ����
		// ���������������·��������Ҫ�涨һ��ʵ���ļ��Ĵ�ŵ�
		File file = new File(rootPath + path);
		if (file.exists()) {
			// ���ڣ�������ļ������contentType���ļ�����
			String contentType = "text/html";
			if (path.endsWith(".html")) {
				contentType = "text/html";
			} else if (path.endsWith(".jpg") || path.endsWith(".jpeg")) {
				contentType = "image/jpeg";
			} else if (path.endsWith(".png")) {
				contentType = "image/png";
			} else if (path.endsWith(".gif")) {
				contentType = "image/gif";
			} else if (path.endsWith(".css")) {
				contentType = "text/css";
			} else {
				contentType = "application/octet-stream";
			}

			try {
				FileInputStream fis = new FileInputStream(file);
				Response resp = new Response(200, fis, contentType);
				return resp;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				return null;
			}

		} else if (path.endsWith("login.do")) {
			// ����ͻ�����������login.do��β�ĵ�ַ������Լ�������û���Ҫ��¼
			// ��¼�����ȡ���û��ύ���û���������
			//System.out.println("��¼���û���Ϊ:"+req.getParams().get("username"));
			UserInfoDAO dao = new UserInfoDAOImpl();
			UserInfo userInfo = dao.findByUserName(req.getParams().get("username").toString());
			String message = "";
			if(userInfo!=null) {
				//�Ƚ�����
				if(userInfo.getUserPwd().equals(req.getParams().get("pwd").toString())) {
					//�ܹ���¼
					message = "success";
				}else {
					message = "���벻��ȷ";
				}
			}else {
				message = "�û���������";
			}
			ByteArrayInputStream is = new ByteArrayInputStream(message.getBytes());
			Response response = new Response(200, is, "text/html");
			return response;
		}else if(path.equals("userinfo.do")) {
			return null;
		} else {
			// �����ڣ�����һ����ʾ�����Response
			String message = path + ",File Not Found!";
			ByteArrayInputStream is = new ByteArrayInputStream(message.getBytes());
			Response response = new Response(404, is, "text/html");
			return response;
		}

	}

	/**
	 * ����HTTPЭ�����Ӧ���ĸ�ʽ�����Ӧ����
	 * 
	 * @param os
	 */
	public static void writeResponse(OutputStream os, Response resp) {
		StringBuffer sb = new StringBuffer();
		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM ddHH:mm:ss 'GMT' yyyy", Locale.US);
		// ��һ������ӦͶͷ
		if (resp.getCode() == HTTP_STATUS_OK) {
			sb.append(HTTP_1_1_200_OK);
		} else {
			sb.append(HTTP_1_1_404_NOTFOUND);
		}
		// �ڶ���ͨ��������
		Date now = new Date();
		sb.append("Date: ");
		sb.append(sdf.format(now));
		sb.append("\r\n");
		// �����п��������������Ϣ
		sb.append("Server: Octopus1905Server\r\n");
		// �����п���������ݸ�ʽ
		sb.append("Content-Type: ");
		sb.append(resp.getContentType());
		sb.append("\r\n");
		// ������д���ݳ���
		try {
			int len = resp.getContent().available();// ���п��Զ�ȡ�����ݳ���
			sb.append("Content-Length: ");
			sb.append(String.valueOf(len));
			sb.append("\r\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// �ǵ����ݿ�ʼǰ������һ������
		sb.append("\r\n");
		// д������
		try {
			os.write(sb.toString().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}

//		// �����������ĩβ����һ����Ϣ
//		String bottomContent = "����һ��׷�ӵ��ײ��Ĺ��";
//		try {
//			os.write(bottomContent.getBytes("UTF-8"));
//			os.flush();
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		// д���ļ���������ݣ�������Ϣ��ByteArrayInputStream��ŵ�һ���ַ�����
		byte[] buffer = new byte[4096];

		try (InputStream is = resp.getContent();) {
			while (true) {
				int len = is.read(buffer);
				if (len > 0) {
					os.write(buffer, 0, len);
				} else {
					break;
				}
			}
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
