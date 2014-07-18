/*************************************************************************
> File Name: StudentDaojava
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
import java.util.List;
import com.trilever.DAOManager.*;
import com.trilever.entity.*;
public class StudentDao
{
	public boolean add(Student stu) throws SQLException
	{
		String sql = "insert into student (stu_Id,stu_Name,stu_Age,stu_Ger,teachId,group_Id) values(?,?,?,?,?,?)";
		System.out.println(sql);
		Object[] obs = new Object[]
		{ stu.getStu_Id(), stu.getStu_Name(), stu.getStu_Age(),
				stu.isStu_Ger(), stu.getTeachId(), stu.getGroup_Id() };
		DaoManager fdm = new DaoManager();
		int row = fdm.insertManager(sql, obs);
		if (row != 0)
			return true;
		else
			return false;
	}

	public boolean delete(int id) throws SQLException
	{
		String sql = "delete from student where stu_Id= ?";
		System.out.println(sql);

		DaoManager fdm = new DaoManager();
		int row = fdm.deleteManager(sql, id);
		if (row != 0)
			return true;
		else
			return false;
	}

	public boolean update(Student stu) throws SQLException
	{
		String sql = "update student set stu_Age = ? where stu_Name=?";
		System.out.println(sql);
		Object[] obs = new Object[]
		{ stu.getStu_Age(), "trilever" };
		DaoManager fdm = new DaoManager();
		int row = fdm.updateManager(sql, obs);
		if (row != 0)
			return true;
		else
			return false;
	}

	public Student find(int id) throws SQLException
	{
		String sql = "select stu_Id,stu_Name,stu_Age,stu_Ger,teachId, group_Id from student where stu_Id = ?";
		DaoManager fdm = new DaoManager();
		ResultSet mk = fdm.findManager(sql, id);
		Student stu = new Student();
		while (mk.next())
		{
			stu.setStu_Id(mk.getInt("stu_Id"));
			stu.setStu_Name(mk.getString("stu_Name"));
			stu.setStu_Age(mk.getInt("stu_Age"));
			stu.setStu_Ger(mk.getByte("stu_Ger"));
			stu.setTeachId(mk.getInt("teachId"));
			stu.setGroup_Id(mk.getInt("group_Id"));
		}
		// ���ڲ�ѯ���ԣ�������ʹ�ý�����֮ǰ�͹ر��˽�����������Ҫ��DaoManager��������һ��closeFunc()��������������ʹ���˽�����ResultSet֮���ٹر���
		fdm.closeFunc();
		return stu;
	}

	public List<Student> findAll() throws SQLException
	{
		String sql = "select * from student";
		DaoManager fdm = new DaoManager();
		List<Student> mk = fdm.findAllManager(sql);
		// ���ڲ�ѯ���ԣ�������ʹ�ý�����֮ǰ�͹ر��˽�����������Ҫ��DaoManager��������һ��closeFunc()��������������ʹ���˽�����ResultSet֮���ٹر���
		fdm.closeFunc();
		return mk;
	}
}
