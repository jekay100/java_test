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
			// װ�ء�ע����
			Class.forName(driver);
			// �޽�JavaӦ�ó��������ݿ�֮�����ӵ�·��
			conn = DriverManager.getConnection(url, user, password);
			if (!conn.isClosed())
			{
				System.out.println("connects succees!");
			}
			past = conn.prepareStatement(sql);
			past.setInt(1, id);
			// ִ��sql��ѯ����
			rs = past.executeQuery();
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("��û���ҵ�");
		}
		return rs;
	}

	public List<Student> findAllManager(String sql) throws SQLException
	{
		List<Student> lstu = new LinkedList<>();
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
			past = conn.prepareStatement(sql);
			// ִ��sql��ѯ����
			rs = past.executeQuery();
			while (rs.next())
			{
				lstu.add(new ResultMappingEntity().MappingResultEntity(rs));
			}
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("��û���ҵ�");
		}
		return lstu;
	}

	public int insertManager(String sql, Object[] obs) throws SQLException
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
			past = conn.prepareStatement(sql);
			for (int i = 0; i < obs.length; i++)
			{
				past.setObject(i + 1, obs[i]);
			}
			// ִ��sql��ѯ����
			row = past.executeUpdate();
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("��û���ҵ�");
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
			// װ�ء�ע����
			Class.forName(driver);
			// �޽�JavaӦ�ó��������ݿ�֮�����ӵ�·��
			conn = DriverManager.getConnection(url, user, password);
			if (!conn.isClosed())
			{
				System.out.println("connects succees!");
			}
			past = conn.prepareStatement(sql);
			past.setInt(1, id);
			// ִ��sql��ѯ����
			row = past.executeUpdate();
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("��û���ҵ�");
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
			// װ�ء�ע����
			Class.forName(driver);
			// �޽�JavaӦ�ó��������ݿ�֮�����ӵ�·��
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
			// ִ��sql��ѯ����
			row = past.executeUpdate();
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("��û���ҵ�");
		} finally
		{
			this.closeFunc();
		}
		return row;
	}

	// �������ݿ��Ĳ�ѯ�����صĽ�����ResultSet����ʹ����������֮ǰ���ܹرոý�����������Ҫר����һ�򷽷���ר�Źرս�������
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
