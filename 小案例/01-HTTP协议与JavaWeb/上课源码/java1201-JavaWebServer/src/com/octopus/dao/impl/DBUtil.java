package com.octopus.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.PreparedStatement;

/**
 * 标准的数据库工具类，提供基本的增删改查方法
 * 
 * @author hw
 *
 */
public class DBUtil {

	public static String username = "root";
	public static String password = "root";
	public static String driverClassName = "com.mysql.jdbc.Driver";
	public static String url = "jdbc:mysql://localhost:3306/shop1905";

	/**
	 * 创建连接
	 * 
	 * @return
	 */
	public static Connection getConn() {
		Connection conn = null;

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

		return conn;
	}

	/**
	 * 执行增删改
	 * 
	 * @param sql
	 * @return
	 */
	public static int executeUpdate(String sql) {
		Connection conn = null;
		Statement st = null;

		try {
			// 获取连接
			conn = CreateDbConnection.getConn();
			// 创建Statement对象
			st = conn.createStatement();
			// 执行语句
			int count = st.executeUpdate(sql);
			return count;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		} finally {
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 执行增删改
	 * 
	 * @param sql
	 * @return
	 */
	public static int executeUpdate(String sql, Object[] params) {
		Connection conn = null;
		PreparedStatement st = null;

		try {
			// 获取连接
			conn = CreateDbConnection.getConn();
			// 创建Statement对象
			st = conn.prepareStatement(sql);
			// 为每一个?参数赋值
			if (params != null) {
				for (int i = 0; i < params.length; i++) {
					st.setObject(1 + i, params[i]);// 注意第几个参数是从1开始的
				}
			}
			// 执行语句
			int count = st.executeUpdate();
			return count;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		} finally {
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 执行查询
	 * 
	 * @param sql
	 * @return
	 */
	public static ResultSet executeQuery(String sql) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			// 获取连接
			conn = CreateDbConnection.getConn();
			// 创建Statement
			st = conn.createStatement();
			// 执行查询
			rs = st.executeQuery(sql);
			// 处理结果集的数据
			return rs;
		} catch (SQLException ex) {
			ex.printStackTrace();
			return null;
		}
	}

	/**
	 * 协助关闭资源
	 * 
	 * @param rs
	 * @param st
	 * @param conn
	 */
	public static void closeResouce(ResultSet rs, Statement st, Connection conn) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static ResultSet executeQuery(String sql, Object[] params) {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			// 获取连接
			conn = CreateDbConnection.getConn();
			// 创建Statement
			st = conn.prepareStatement(sql);
			// 将参数注入statement
			if (params != null && params.length != 0) {
				for (int i = 0; i < params.length; i++) {
					st.setObject(i + 1, params[i]);
				}
			}
			// 执行查询
			rs = st.executeQuery();
			// 处理结果集的数据
			return rs;
		} catch (SQLException ex) {
			ex.printStackTrace();
			return null;
		}
	}
}
