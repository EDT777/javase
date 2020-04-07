package Socket;

import java.io.*;
import java.net.*;
import java.util.*;

public class 服务器 {
	public static void main(String[] args) throws Exception {
		ServerSocket s = new ServerSocket(8888);
		System.out.println("服务器开始监听");
		Socket socket = s.accept();
		System.out.println("连接成功");
		Scanner ss = new Scanner(System.in);

		try (InputStream is = socket.getInputStream(); OutputStream os = socket.getOutputStream();) {
			while (true) {
				// 接收客户端消息
				byte[] buffer = new byte[10240];
				int len = is.read(buffer);
				System.out.print("客户端发来消息：" + new String(buffer, 0, len));

				System.out.print("请输入要发送给客户端的消息：");

				String s2 = ss.next();
				os.write(s2.getBytes());

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
