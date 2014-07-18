/*************************************************************************
	> File Name: ResultMappingEntity.java
	> Author: trilever
	> Version: 1.0
	> Mail: trilever31204@gmail.com
	> Created Time: 2014-7-18 14:52:50
	> This program test the ResultMappingEntity.
************************************************************************/
package com.trilever.DAOManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.trilever.entity.Student;

interface ResultMappingtoEntity
{
	public Object MappingResultEntity(ResultSet rs) throws SQLException;
}

public class ResultMappingEntity implements ResultMappingtoEntity
{
	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.trilever.DAOManager.ResultMappingEntity#MappingResultEntity(java.
	 * sql.ResultSet)
	 */
	@Override
	public Student MappingResultEntity(ResultSet rs) throws SQLException
	{
		Student stu = new Student(rs.getInt("stu_Id"),
				rs.getString("stu_Name"), rs.getInt("stu_Age"),
				rs.getByte("stu_Ger"), rs.getInt("teachId"),
				rs.getInt("group_Id"));
		return stu;
	}
}
