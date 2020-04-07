package com.octopus.java0716;


/**
 * 代表一次请求
 * @author hw
 *
 */
public class Request {
	/**
	 * 请求的路径，对应的文件
	 */
	private String path;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Request(String path) {
		super();
		this.path = path;
	}

	public Request() {
		super();
	}
	
	
}
