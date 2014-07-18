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
			// װ�ء�ע����
			Class.forName(driver);
			// �޽�JavaӦ�ó��������ݿ�֮�����ӵ�·��
			conn = DriverManager.getConnection(url, user, password);
			if (!conn.isClosed())
			{
				System.out.println("connects succees!");
			}
			// ����������������ĳ�
			// ִ��sql��ѯ���
			String sql = "insert into student (stu_Id,stu_Name,stu_Age,stu_Ger,teachId,group_Id) values(?,?,?,?,?,?)";
			//����һ��PreparedStatement�����Ժ��������������д��ݲ�����
			pst = conn.prepareStatement(sql);

			// ����ֱ�����������������д��ݲ������������������ݿ�ֻ����һ�������䣬���ǿ���ִ��n��SQL��䡣
			pst.setInt(1, 20);
			pst.setString(2, "trilever");
			pst.setInt(3, 18);
			pst.setByte(4, (byte) 1);
			pst.setInt(5, 22);
			pst.setInt(6, 1);
			row = pst.executeUpdate();
			System.out.println(row);

			// ����ֱ�����������������д��ݲ������������������ݿ�ֻ����һ�������䣬���ǿ���ִ��n��SQL��䡣
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
			System.out.println("��û���ҵ�");
		} finally
		{
			conn.close();
			pst.close();
		}
	}
}
