package com.octopus.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 演示如何建立数据库的连接
 * 
 * @author hw
 *
 */
public class CreateDbConnection {
	public static void main(String[] args) {
		Connection conn = getConn();

		// 第五步：不成功就成仁
		System.out.println(conn);

	}

	public static Connection getConn() {
		Connection conn = null;
		// 第一步：添加驱动包

		// 第二步：准备好连接参数
		String username = "root";
		String password = "root";
		// 第三个参数是告诉JDBC这个工厂我要的实现类是哪个
		String driverClassName = "com.mysql.jdbc.Driver";
		// 第四个包含了连接目标的基本信息，叫做连接字符串url
		String url = "jdbc:mysql://localhost:3306/shop1905";
		
		// 第三步：设法加载实际驱动程序（实现类）
	
		try {
			Class.forName(driverClassName);
			// 第四步：建立连接
			conn = DriverManager.getConnection(url, username, password);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//如果将来要返回连接给别人用则不能关闭
//		 finally {
//			if (conn != null) {
//				// 清理工作：使用完的连接要关闭
//				try {
//					conn.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		}
		return conn;
	}
}
