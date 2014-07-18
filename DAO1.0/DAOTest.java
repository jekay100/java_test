/*
 * 本类就是DAO层的测试类
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
