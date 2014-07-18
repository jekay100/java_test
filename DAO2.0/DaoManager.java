/*************************************************************************
	> File Name: DaoManager.java
	> Author: trilever
	> Version: 1.0
	> Mail: trilever31204@gmail.com
	> Created Time: 2014-7-18 14:52:50
	> This program test the DaoManager.
************************************************************************/
/*
 * ��������DAO������ɾ���ġ����󷽷��ľ���ʵ��
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
			// װ�ء�ע����
			Class.forName(driver);
			// �޽�JavaӦ�ó��������ݿ�֮�����ӵ�·��
			conn = DriverManager.getConnection(url, user, password);
			if (!conn.isClosed())
			{
				System.out.println("connects succees!");
			}
			// �����������������ĳ�
			stat = conn.createStatement();
			// ִ��sql��ѯ����
			rs = stat.executeQuery(sql);
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("��û���ҵ�");
		}
		return rs;
	}

	public int  insertManager(String sql) throws SQLException
	{
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
			// �����������������ĳ�
			stat = conn.createStatement();
			// ִ��sql��ѯ����
			row = stat.executeUpdate(sql);
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("��û���ҵ�");
		}
		finally
		{
			this.closeFunc();
		}
		return row;
	}

	public int deleteManager(String sql) throws SQLException
	{
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
			// �����������������ĳ�
			stat = conn.createStatement();
			// ִ��sql��ѯ����
			row = stat.executeUpdate(sql);
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("��û���ҵ�");
		}
		finally
		{
			this.closeFunc();
		}
		return row;
	}

	public int updateManager(String sql) throws SQLException
	{
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
			// �����������������ĳ�
			stat = conn.createStatement();
			// ִ��sql��ѯ����
			row = stat.executeUpdate(sql);
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("��û���ҵ�");
		}
		finally
		{
			this.closeFunc();
		}
		return row;
	}
	//�������ݿ��Ĳ�ѯ�����صĽ�����ResultSet����ʹ����������֮ǰ���ܹرոý�����������Ҫר����һ�򷽷���ר�Źرս�������
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
			System.out.println("�ر�ʧ����");
		}
	}
}
