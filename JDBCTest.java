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
			//װ�ء�ע����
			Class.forName(driver);
			//�޽�JavaӦ�ó��������ݿ�֮�����ӵ�·��
			Connection conn = DriverManager.getConnection(url,user,password);
			if(!conn.isClosed())
			{
				System.out.println("connect suc78ceewerqd!");
			}
			//����������������ĳ�
			Statement stat = conn.createStatement();
			String sql = "select stu_Id,stu_Name,stu_Age from student";
			//ִ��sql��ѯ���
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


