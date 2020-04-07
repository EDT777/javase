package web服务器.src.com.octopus.java0906;

import java.io.InputStream;

/**
 * ������װ��Ӧ������
 * @author hw
 *
 */
public class Response {
	
	/**
	 * ��Ӧ״̬�𣬸����������Ӧ�Ļ��������
	 * 200 ��ʾ��������
	 * 404 ��ʾ���ݲ���
	 * 400 ��ʾ�����������
	 */
	private int code ;
	
	/**
	 * �����code������������200��ӦOK ��404��ӦNot Found��400 ��ӦBad Request
	 */
	private String state;
	
	/**
	 * �����������Ӧ�������Ǹ���ģ�����ͼƬ����ҳ
	 */
	private String contentType;
	
	/**
	 * ����Ҫ��ʵ���͵�����
	 */
	private InputStream content ;

	public Response(int code, String state, String contentType, InputStream content) {
		super();
		this.code = code;
		this.state = state;
		this.contentType = contentType;
		this.content = content;
	}
	
	

	public Response() {
		super();
	}



	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public InputStream getContent() {
		return content;
	}

	public void setContent(InputStream content) {
		this.content = content;
	}
	
	
	
	
}
