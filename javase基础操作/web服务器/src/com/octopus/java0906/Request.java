package web服务器.src.com.octopus.java0906;


/**
 * ��װ���������
 * @author hw
 *
 */
public class Request {
	
	/**
	 * ����·��
	 */
	private String path ;

	public Request(String path) {
		super();
		this.setPath(path);
	}

	public Request() {
		super();
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
}
