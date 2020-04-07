package Socket;

import java.io.*;
import java.net.*;
import java.util.*;

public class 客户端 {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		try {
			Socket socket = new Socket("127.0.0.1", 8888);
			try (InputStream is = socket.getInputStream(); OutputStream os = socket.getOutputStream()) {

				while (true) {
					// 发送给服务器消息
					System.out.println("请输入发送给服务器的消息");
					String s1 = s.next();
					os.write(s1.getBytes());
					// 获取服务器消息
					byte b[] = new byte[3333];
					int len = is.read(b);

					System.out.println("服务器发来消息：" + new String(b, 0, len));

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
