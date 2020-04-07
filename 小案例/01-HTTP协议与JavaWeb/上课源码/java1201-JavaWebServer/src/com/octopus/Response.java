package com.octopus;

import java.io.InputStream;

/**
 * ����һ����Ӧ
 * @author hw
 *
 */
public class Response {
	
	/**
	 * ���߿ͻ�������Ľ��������200��������ɹ���404�����������ݲ�����
	 */
	private int code ;
	
	/**
	 * ����Ҫ��ȡ��������������п�����һ�����֣�Ҳ������һ���ļ�
	 */
	private InputStream content ;
	
	/**
	 * ��������ʱ������������ص���ʲô������ҳ������ͼƬ�����������ı���css��
	 */
	private String contentType;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public InputStream getContent() {
		return content;
	}

	public void setContent(InputStream content) {
		this.content = content;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Response(int code, InputStream content, String contentType) {
		super();
		this.code = code;
		this.content = content;
		this.contentType = contentType;
	}

	public Response() {
		super();
	}
	
	
}
