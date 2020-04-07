package com.octopus;

import java.io.InputStream;

/**
 * 代表一个响应
 * @author hw
 *
 */
public class Response {
	
	/**
	 * 告诉客户端请求的结果，比如200代表请求成功，404代表请求内容不存在
	 */
	private int code ;
	
	/**
	 * 将来要获取的内容在哪里，既有可能是一段文字，也可能是一个文件
	 */
	private InputStream content ;
	
	/**
	 * 返回内容时告诉浏览器返回的是什么，是网页，还是图片，还是其他的比如css等
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
