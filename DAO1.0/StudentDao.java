/*
 * 本类即是针对于student表的DAO层，主要提供功能就是数据的增删改查。
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
		//对于查询而言，不能再使用结果集之前就关闭了结果集，所以要在DaoManager类中增加一个closeFunc()方法，以用于在使用了结果集ResultSet之后再关闭它
		fdm.closeFunc();
	}
}
