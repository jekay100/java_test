/**
 * @file Name: JDBCTest.java
 * @description:Test the JDBCTest connector
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-15 19:07:13
 */
import java.sql.*; 
public class JDBCTest 
{
	public static void main(String[] args)
	{
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/class";
		String user = "root";
		String password = "wt312041990";
		try
		{
			//装载、注册类
			Class.forName(driver);
			//修建Java应用程序与数据库之间连接的路径
			Connection conn = DriverManager.getConnection(url,user,password);
			if(!conn.isClosed())
			{
				System.out.println("connect suc78ceewerqd!");
			}
			//创建用于数据运输的车
			Statement stat = conn.createStatement();
			String sql = "select stu_Id,stu_Name,stu_Age from student";
			//执行sql查询语句
			ResultSet rs = stat.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(rs.getString("stu_Id"));
				System.out.println(rs.getString("stu_Name"));
				System.out.println(rs.getString("stu_Age"));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}


