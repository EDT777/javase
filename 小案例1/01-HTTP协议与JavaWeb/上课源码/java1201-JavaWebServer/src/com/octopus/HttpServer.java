package com.octopus;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 监听80端口并建立连接
 * 
 * @author hw
 *
 */
public class HttpServer {

	public static void main(String[] args) {
		startServer();
	}
	
	/**
	 * 启动服务器
	 */
	public static void startServer() {
		boolean shouldExists = false;// 控制服务器是否继续接受新的连接
		try (ServerSocket serverSocket = new ServerSocket(80);) {

			while (!shouldExists) {
				try (Socket socket = serverSocket.accept();/*这是建立连接了*/
						InputStream is = socket.getInputStream();
						OutputStream os = socket.getOutputStream();) {

					// 解析客户的需求
					Request req = HttpUtil.parseRequest(is);
					if (req != null) {
						System.out.println("接收到请求，请求的文件为:" + req.getPath());
					}else {
						continue;
					}
					// 返回内容（错误提示）
					Response resp = HttpUtil.processRequest(req);
					//响应最终要返回客户端
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
