/*
 * 本类就是DAO层增、删、改、查各方法的具体实现
 */
package com.trilever.DAOManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoManager
{
	private Connection conn = null;
	private Statement stat = null;
	private ResultSet rs = null;
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/class";
	private String user = "root";
	private String password = "wt312041990";
	private int row = 0;

	public ResultSet findManager(String sql) throws SQLException
	{
		try
		{
			// 装载、注册类
			Class.forName(driver);
			// 修建Java应用程序与数据库之间连接的路径
			conn = DriverManager.getConnection(url, user, password);
			if (!conn.isClosed())
			{
				System.out.println("connects succees!");
			}
			// 创建用于数据运输的车
			stat = conn.createStatement();
			// 执行sql查询语句
			rs = stat.executeQuery(sql);
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("包没有找到");
		}
		return rs;
	}

	public int insertManager(String sql) throws SQLException
	{
		try
		{
			// 装载、注册类
			Class.forName(driver);
			// 修建Java应用程序与数据库之间连接的路径
			conn = DriverManager.getConnection(url, user, password);
			if (!conn.isClosed())
			{
				System.out.println("connects succees!");
			}
			// 创建用于数据运输的车
			stat = conn.createStatement();
			// 执行sql查询语句
			row = stat.executeUpdate(sql);
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("包没有找到");
		} finally
		{
			this.closeFunc();
		}
		return row;
	}

	public int deleteManager(String sql) throws SQLException
	{
		try
		{
			// 装载、注册类
			Class.forName(driver);
			// 修建Java应用程序与数据库之间连接的路径
			conn = DriverManager.getConnection(url, user, password);
			if (!conn.isClosed())
			{
				System.out.println("connects succees!");
			}
			// 创建用于数据运输的车
			stat = conn.createStatement();
			// 执行sql查询语句
			row = stat.executeUpdate(sql);
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("包没有找到");
		} finally
		{
			this.closeFunc();
		}
		return row;
	}

	public int updateManager(String sql) throws SQLException
	{
		try
		{
			// 装载、注册类
			Class.forName(driver);
			// 修建Java应用程序与数据库之间连接的路径
			conn = DriverManager.getConnection(url, user, password);
			if (!conn.isClosed())
			{
				System.out.println("connects succees!");
			}
			// 创建用于数据运输的车
			stat = conn.createStatement();
			// 执行sql查询语句
			row = stat.executeUpdate(sql);
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("包没有找到");
		} finally
		{
			this.closeFunc();
		}
		return row;
	}

	// 对于数据库的查询，返回的结果集ResultSet，在使用完结果集之前不能关闭该结果集，所以要专门用一个方法来专门关闭结果集。
	public void closeFunc()
	{
		try
		{
			if (rs != null)
			{
				rs.close();
				rs = null;
			}
			if (stat != null)
			{
				stat.close();
				stat = null;
			}
			if (conn != null)
			{
				conn.close();
				conn = null;
			}
		} catch (Exception e2)
		{
			e2.printStackTrace();
			System.out.println("关闭失误！");
		}
	}
}
