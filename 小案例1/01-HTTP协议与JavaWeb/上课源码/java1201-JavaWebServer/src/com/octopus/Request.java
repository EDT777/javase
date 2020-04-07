package com.octopus;

import java.util.HashMap;
import java.util.Map;

/**
 * ����һ������
 * @author hw
 *
 */
public class Request {
	/**
	 * �����·������Ӧ���ļ�
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
