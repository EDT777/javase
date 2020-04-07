package com.octopus;

import com.octopus.dao.UserInfoDAO;
import com.octopus.dao.impl.UserInfoDAOImpl;
import com.octopus.entity.UserInfo;

public class TestUserInfoDao {
	public static void main(String[] args) {
		UserInfoDAO dao = new UserInfoDAOImpl();
		UserInfo userInfo = dao.findByUserName("user1");
		System.out.println(userInfo);
	}
}
