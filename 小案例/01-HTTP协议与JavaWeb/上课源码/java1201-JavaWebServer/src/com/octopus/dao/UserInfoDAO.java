package com.octopus.dao;

import com.octopus.entity.UserInfo;

public interface UserInfoDAO {
	/**
	 * �����û��������û���Ϣ
	 * @param userName
	 * @return
	 */
	public UserInfo findByUserName(String userName);
}
