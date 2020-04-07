package 服务器创建;

import java.io.FileInputStream;
import java.io.InputStream;

public class response {
	private int code;
	private String state;
	private String contentType;
	private InputStream is;
//报文格式
	public response(int code, String state, String contentType, InputStream is) {

		this.code = code;
		this.state = state;
		this.contentType = contentType;
		this.is = is;
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

	public InputStream getIs() {
		return is;
	}

	public void setIs(InputStream is) {
		this.is = is;
	}

}
