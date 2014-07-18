/*
 * 本类就是DAO层的测试类
 */
package com.trilever.daoTest;

import java.sql.SQLException;

import com.trilever.DAO.*;
import com.trilever.entity.*;

public class DAOTest
{
	public static void main(String[] args) throws SQLException
	{
		DAOTest dt = new DAOTest();
		dt.findTest();
	}

	public void addTest() throws SQLException
	{
		Student stu = new Student(13, "wssgsdgs", 35, false, 23, 2);
		StudentDao stuD = new StudentDao();
		boolean result = stuD.add(stu);
		if (result == true)
		{
			System.out.println("增加数据成功");
		} else
			System.out.println("增加数据失败");
	}

	public void deleteTest() throws SQLException
	{
		int id = 10;
		StudentDao stuD = new StudentDao();
		boolean result = stuD.delete(id);
		if (result == true)
		{
			System.out.println("刪除数据成功");
		} else
			System.out.println("刪除数据失败");
	}

	public void updateTest() throws SQLException
	{
		Student stu = new Student(12, "wssgsdgs", 35, false, 23, 2);
		StudentDao stuD = new StudentDao();
		boolean result = stuD.update(stu);
		if (result == true)
		{
			System.out.println("修改数据成功");
		} else
			System.out.println("修改数据失败");
	}

	public void findTest() throws SQLException
	{
		StudentDao stuD = new StudentDao();
		Student result = stuD.find(1);
		System.out.println(result);
	}
}
