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
import com.trilever.DAO.*;
public class DAOTest
{
	public static void main(String[] args) throws SQLException
	{
		new StudentDao().find();
		new StudentDao().add();
		new StudentDao().delete();
		new StudentDao().update();
	}
}
