package com.trilever.entity;

/**
 * @author trilever
 * 
 */
public class Student
{
	private int stu_Id;
	private String stu_Name;
	private int stu_Age;
	private boolean stu_Ger;
	private int teachId;
	private int group_Id;

	public Student()
	{
		super();
	}

	/**
	 * @return the stu_Id
	 */
	public int getStu_Id()
	{
		return stu_Id;
	}

	/**
	 * @param stu_Id
	 *            the stu_Id to set
	 */
	public void setStu_Id(int stu_Id)
	{
		this.stu_Id = stu_Id;
	}

	public Student(int stu_Id, String stu_Name, int stu_Age, boolean stu_Ger,
			int teachId, int group_Id)
	{
		super();
		this.stu_Id = stu_Id;
		this.stu_Name = stu_Name;
		this.stu_Age = stu_Age;
		this.stu_Ger = stu_Ger;
		this.teachId = teachId;
		this.group_Id = group_Id;
	}

	public Student(String stu_Name, int stu_Age, boolean stu_Ger, int teachId,
			int group_Id)
	{
		super();
		this.stu_Name = stu_Name;
		this.stu_Age = stu_Age;
		this.stu_Ger = stu_Ger;
		this.teachId = teachId;
		this.group_Id = group_Id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Student [stu_Name=" + stu_Name + ", stu_Age=" + stu_Age
				+ ", stu_Ger=" + stu_Ger + ", teachId=" + teachId
				+ ", group_Id=" + group_Id + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object arg0)
	{
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	/**
	 * @return the stu_Name
	 */
	public String getStu_Name()
	{
		return stu_Name;
	}

	/**
	 * @param stu_Name
	 *            the stu_Name to set
	 */
	public void setStu_Name(String stu_Name)
	{
		this.stu_Name = stu_Name;
	}

	/**
	 * @return the stu_Age
	 */
	public int getStu_Age()
	{
		return stu_Age;
	}

	/**
	 * @param stu_Age
	 *            the stu_Age to set
	 */
	public void setStu_Age(int stu_Age)
	{
		this.stu_Age = stu_Age;
	}

	/**
	 * @return the stu_Ger
	 */
	public int isStu_Ger()
	{
		if (stu_Ger = true)
			return 1;
		else
			return 0;
	}

	/**
	 * @param stu_Ger
	 *            the stu_Ger to set
	 */
	public void setStu_Ger(boolean stu_Ger)
	{
		this.stu_Ger = stu_Ger;
	}

	/**
	 * @return the teachId
	 */
	public int getTeachId()
	{
		return teachId;
	}

	/**
	 * @param teachId
	 *            the teachId to set
	 */
	public void setTeachId(int teachId)
	{
		this.teachId = teachId;
	}

	/**
	 * @return the group_Id
	 */
	public int getGroup_Id()
	{
		return group_Id;
	}

	/**
	 * @param group_Id
	 *            the group_Id to set
	 */
	public void setGroup_Id(int group_Id)
	{
		this.group_Id = group_Id;
	}
}
