/*************************************************************************
    > File Name: abstractTestDrive.java
    > Author: trilever
    > Version: 1.0
    > Mail: trilever31204@gmail.com
    > Created Time: 2014-5-7 17:46:50
	  > This program test the feature of abstract.
 ************************************************************************/
abstract class person
{
	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}
	public abstract int setNum();
	private String name;
	private int age;
	private int num;
}

class Employee extends person
{
	public Employee()
	{
		name="wt";
		age=12;
		num=30;
	}

	public int setNum()
	{
		return num;
	}
	private String name;
	private int age;
	private int num;
}

public class abstractTestDrive
{
	public static void main(String[] args)
	{
		person p=new Employee();
		System.out.println(p.setNum());
	}
}
