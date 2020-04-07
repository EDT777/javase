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
 * 实现HTTP协议的基本操作
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
	 * 解析请求：获取用户想要的资源的路径
	 * 
	 * @param is
	 * @return
	 */
	public static Request parseRequest(InputStream is) {
		try {
			// 将网络流转为普通的非阻塞的流
			ByteArrayOutputStream bos = new ByteArrayOutputStream(is.available());

			int num = 0;
			while (is.available() == 0 && num++ < 2000) {
				Thread.sleep(1);
			}

			while ((is.available() > 0)) {

				bos.write(is.read());
			}

			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			// 再读取
			InputStreamReader reader = new InputStreamReader(bis);
			BufferedReader bfr = new BufferedReader(reader);
			// 请求地址就在请求行也就是第一行中
			String line = bfr.readLine();
			if (line == null) {
				return null;// 这是一个无法解析的请求
			}
			String[] words = line.split(" ");
			String path = words[1];
			Request req = null;
			if (path.indexOf('?') > 0) {
				// 得到参数
				String params = path.substring(path.indexOf('?') + 1);
				path = path.substring(0, path.indexOf('?'));
				req = new Request(path);
				// 参数的处理过程：&分割了多个参数
				String[] paramsArr = params.split("&");
				for (String p : paramsArr) {
					int eqIndex = p.indexOf('=');// 单引号和双引号有什么区别？
					if (eqIndex > -1) {
						System.out.println("获取到一个提交的参数:" + p.substring(0, eqIndex) + ",值为:" + p.substring(eqIndex + 1));
						req.getParams().put(p.substring(0, eqIndex),p.substring(eqIndex + 1));
					} else {
						System.out.println("获取到一个无参数值的参数:" + p);
						req.getParams().put(p, null);//这和put一个null的区别在哪里？能区别是否提交了该参数
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
	 * 按照服务器的需要（文件存在则返回文件否则返回错误信息）根据请求创建对应的响应内容
	 * 
	 * @return
	 */
	public static Response processRequest(Request req) {
		// 获取请求中的文件路径
		String path = req.getPath();
		// 检查文件是否存在
		// 浏览器请求的是相对路径，我们要规定一个实际文件的存放地
		File file = new File(rootPath + path);
		if (file.exists()) {
			// 存在，则根据文件名获得contentType和文件内容
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
			// 如果客户端请求了以login.do结尾的地址，我们约定这是用户需要登录
			// 登录必须获取到用户提交的用户名和密码
			//System.out.println("登录的用户名为:"+req.getParams().get("username"));
			UserInfoDAO dao = new UserInfoDAOImpl();
			UserInfo userInfo = dao.findByUserName(req.getParams().get("username").toString());
			String message = "";
			if(userInfo!=null) {
				//比较密码
				if(userInfo.getUserPwd().equals(req.getParams().get("pwd").toString())) {
					//能够登录
					message = "success";
				}else {
					message = "密码不正确";
				}
			}else {
				message = "用户名不存在";
			}
			ByteArrayInputStream is = new ByteArrayInputStream(message.getBytes());
			Response response = new Response(200, is, "text/html");
			return response;
		}else if(path.equals("userinfo.do")) {
			return null;
		} else {
			// 不存在，返回一个表示错误的Response
			String message = path + ",File Not Found!";
			ByteArrayInputStream is = new ByteArrayInputStream(message.getBytes());
			Response response = new Response(404, is, "text/html");
			return response;
		}

	}

	/**
	 * 按照HTTP协议的响应报文格式输出对应内容
	 * 
	 * @param os
	 */
	public static void writeResponse(OutputStream os, Response resp) {
		StringBuffer sb = new StringBuffer();
		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM ddHH:mm:ss 'GMT' yyyy", Locale.US);
		// 第一行是响应投头
		if (resp.getCode() == HTTP_STATUS_OK) {
			sb.append(HTTP_1_1_200_OK);
		} else {
			sb.append(HTTP_1_1_404_NOTFOUND);
		}
		// 第二行通常是日期
		Date now = new Date();
		sb.append("Date: ");
		sb.append(sdf.format(now));
		sb.append("\r\n");
		// 第三行可以输出服务器信息
		sb.append("Server: Octopus1905Server\r\n");
		// 第四行可以输出内容格式
		sb.append("Content-Type: ");
		sb.append(resp.getContentType());
		sb.append("\r\n");
		// 第五行写内容长度
		try {
			int len = resp.getContent().available();// 流中可以读取的数据长度
			sb.append("Content-Length: ");
			sb.append(String.valueOf(len));
			sb.append("\r\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 记得内容开始前必须有一个空行
		sb.append("\r\n");
		// 写入流中
		try {
			os.write(sb.toString().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}

//		// 给所有请求的末尾都加一行信息
//		String bottomContent = "这是一行追加到底部的广告";
//		try {
//			os.write(bottomContent.getBytes("UTF-8"));
//			os.flush();
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		// 写入文件本身的数据（错误信息用ByteArrayInputStream存放的一个字符串）
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
