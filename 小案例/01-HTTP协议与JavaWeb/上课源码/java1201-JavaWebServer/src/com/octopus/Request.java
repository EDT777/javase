package com.octopus;

import java.util.HashMap;
import java.util.Map;

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
	
	private Map<String,Object> params = new HashMap<>();

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

	public Map<String,Object> getParams() {
		return params;
	}

	public void setParams(Map<String,Object> params) {
		this.params = params;
	}
	
	
}
