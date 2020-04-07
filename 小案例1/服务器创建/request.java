package 服务器创建;

public class request {
		private String path;
		
		//获取客户端请求文件名转为此属性
		public  request(String path) {
			
			this.path=path;
		}
		public String getpath() {
			return path;
		}
		
}
