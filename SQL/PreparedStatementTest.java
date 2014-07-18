package com.trilever.SQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class PreparedStatementTest
{
	public static void main(String[] args) throws SQLException
	{
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/class";
		String user = "root";
		String password = "wt312041990";
		int row = 0;
		PreparedStatement pst = null;
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
			// 执行sql查询语句
			String sql = "insert into student (stu_Id,stu_Name,stu_Age,stu_Ger,teachId,group_Id) values(?,?,?,?,?,?)";
			//创建一个PreparedStatement对象，以后可以向这个对象中传递参数。
			pst = conn.prepareStatement(sql);

			// 可以直接无数次向这个语句中传递参数，这样可以让数据库只编译一次这个语句，但是可以执行n次SQL语句。
			pst.setInt(1, 20);
			pst.setString(2, "trilever");
			pst.setInt(3, 18);
			pst.setByte(4, (byte) 1);
			pst.setInt(5, 22);
			pst.setInt(6, 1);
			row = pst.executeUpdate();
			System.out.println(row);

			// 可以直接无数次向这个语句中传递参数，这样可以让数据库只编译一次这个语句，但是可以执行n次SQL语句。
			pst.setInt(1, 21);
			pst.setString(2, "trileverwt");
			pst.setInt(3, 18);
			pst.setByte(4, (byte) 1);
			pst.setInt(5, 22);
			pst.setInt(6, 1);
			row = pst.executeUpdate();
			System.out.println(row);

		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("包没有找到");
		} finally
		{
			conn.close();
			pst.close();
		}
	}
}
