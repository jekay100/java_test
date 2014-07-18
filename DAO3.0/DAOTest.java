/*************************************************************************
	> File Name: DAOTest.java
	> Author: trilever
	> Version: 1.0
	> Mail: trilever31204@gmail.com
	> Created Time: 2014-7-18 14:52:50
	> This program test the DAOTest.
************************************************************************/
/*
 * ��������DAO���Ĳ�����
 */
package com.trilever.daoTest;

import java.sql.SQLException;
import java.util.List;

import com.trilever.DAO.*;
import com.trilever.entity.*;

public class DAOTest
{
	public static void main(String[] args) throws SQLException
	{
		DAOTest dt = new DAOTest();
		dt.findAllTest();
	}

	public void addTest() throws SQLException
	{
		Student stu = new Student(31, "wssgsdgs", 35, (byte) 1, 23, 2);
		StudentDao stuD = new StudentDao();
		boolean result = stuD.add(stu);
		if (result == true)
		{
			System.out.println("�������ݳɹ�");
		} else
			System.out.println("��������ʧ��");
	}

	public void deleteTest() throws SQLException
	{
		int id = 31;
		StudentDao stuD = new StudentDao();
		boolean result = stuD.delete(id);
		if (result == true)
		{
			System.out.println("�h�����ݳɹ�");
		} else
			System.out.println("�h������ʧ��");
	}

	public void updateTest() throws SQLException
	{
		Student stu = new Student(12, "wssgsdgs", 35, (byte) 1, 23, 2);
		StudentDao stuD = new StudentDao();
		boolean result = stuD.update(stu);
		if (result == true)
		{
			System.out.println("�޸����ݳɹ�");
		} else
			System.out.println("�޸�����ʧ��");
	}

	public void findTest() throws SQLException
	{
		StudentDao stuD = new StudentDao();
		Student result = stuD.find(1);
		System.out.println(result);
	}

	public void findAllTest() throws SQLException
	{
		StudentDao stuD = new StudentDao();
		List<Student> ls = stuD.findAll();
		for (Student student : ls)
		{
			System.out.println(student);
		}
	}
}
