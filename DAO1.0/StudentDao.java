/*************************************************************************
	> File Name: StudentDao.java
	> Author: trilever
	> Version: 1.0
	> Mail: trilever31204@gmail.com
	> Created Time: 2014-7-18 14:52:50
	> This program test the StudentDao.
************************************************************************/
/*
 * ���༴��������student����DAO�㣬��Ҫ�ṩ���ܾ������ݵ���ɾ�Ĳ顣
 */
package com.trilever.DAO;
import java.sql.*;
import com.trilever.DAOManager.*;
public class StudentDao
{
	public void add() throws SQLException
	{
		String sql = "insert into student (stu_Id,stu_Name,stu_Age,stu_Ger,teachId,group_Id) values(7,'wsdf',35,0,22,2)";
		DaoManager fdm = new DaoManager();
		int row = fdm.insertManager(sql);
		System.out.println(row);
	}

	public void delete() throws SQLException
	{
		String sql = "delete from student where stu_Id=7";
		DaoManager fdm = new DaoManager();
		int row = fdm.deleteManager(sql);
		System.out.println(row);
	}

	public void update() throws SQLException
	{
		String sql = "update student set stu_Age=stu_Age+10 where stu_Name like \"[a z]\" ";
		DaoManager fdm = new DaoManager();
		int row = fdm.updateManager(sql);
		System.out.println(row);
	}

	public void find() throws SQLException
	{
		String sql = "select stu_Id,stu_Name,stu_Age from student";
		DaoManager fdm = new DaoManager();
		ResultSet mk = fdm.findManager(sql);
		while (mk.next())
		{
			System.out.print(mk.getString("stu_Id") + " ");
			System.out.print(mk.getString("stu_Name") + " ");
			System.out.println(mk.getString("stu_Age"));
		}
		//���ڲ�ѯ���ԣ�������ʹ�ý�����֮ǰ�͹ر��˽�����������Ҫ��DaoManager��������һ��closeFunc()��������������ʹ���˽�����ResultSet֮���ٹر���
		fdm.closeFunc();
	}
}
