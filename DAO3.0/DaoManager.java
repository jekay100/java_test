/*
 * 本类就是DAO层增、删、改、查各方法的具体实现
 */
package com.trilever.DAOManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import com.trilever.entity.*;
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
	PreparedStatement past = null;
	public ResultSet findManager(String sql, int id) throws SQLException
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
			past = conn.prepareStatement(sql);
			past.setInt(1, id);
			// 执行sql查询语句
			rs = past.executeQuery();
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("包没有找到");
		}
		return rs;
	}

	public List<Student> findAllManager(String sql) throws SQLException
	{
		List<Student> lstu = new LinkedList<>();
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
			past = conn.prepareStatement(sql);
			// 执行sql查询语句
			rs = past.executeQuery();
			while (rs.next())
			{
				lstu.add(new ResultMappingEntity().MappingResultEntity(rs));
			}
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("包没有找到");
		}
		return lstu;
	}

	public int insertManager(String sql, Object[] obs) throws SQLException
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
			past = conn.prepareStatement(sql);
			for (int i = 0; i < obs.length; i++)
			{
				past.setObject(i + 1, obs[i]);
			}
			// 执行sql查询语句
			row = past.executeUpdate();
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

	public int deleteManager(String sql, int id) throws SQLException
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
			past = conn.prepareStatement(sql);
			past.setInt(1, id);
			// 执行sql查询语句
			row = past.executeUpdate();
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

	public int updateManager(String sql, Object[] obs) throws SQLException
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
			past = conn.prepareStatement(sql);
			for (int i = 0; i < obs.length; i++)
			{
				past.setObject(i + 1, obs[i]);
			}
			// 执行sql查询语句
			row = past.executeUpdate();
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
