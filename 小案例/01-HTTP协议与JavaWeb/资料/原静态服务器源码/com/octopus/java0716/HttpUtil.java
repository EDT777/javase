package com.octopus.java0716;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
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
			InputStreamReader reader = new InputStreamReader(is);
			BufferedReader bfr = new BufferedReader(reader);
			// 请求地址就在请求行也就是第一行中
			String line = bfr.readLine();
			if (line == null) {
				return null;// 这是一个无法解析的请求
			}
			String[] words = line.split(" ");
			String path = words[1];
			if(path.indexOf('?')>0) {
				path = path.substring(0,path.indexOf('?'));
			}
			Request req = new Request(path);
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
			}else {
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
		// 写入文件本身的数据（错误信息用ByteArrayInputStream存放的一个字符串）
		byte[] buffer = new byte[4096];

		try (InputStream is = resp.getContent();){
			while (true) {
				int len =is.read(buffer);
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
