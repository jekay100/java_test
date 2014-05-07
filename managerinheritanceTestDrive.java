/*************************************************************************
    > File Name: managerinheritanceTestDrive.java
    > Author: trilever
    > Version: 1.0
    > Mail: trilever31204@gmail.com 
    > Created Time: 2014-5-7 10:14:33
    > The program demonstrates  and tansformation
 ************************************************************************/
import java.util.*;

class Emploree
{
	public Emploree(String aname,double asalary,int ayear,int amonth,int aday)
	{
		name=aname;
		salary=asalary;
		GregorianCalendar calendar=new GregorianCalendar(ayear,amonth-1,aday);
		hireDay=calendar.getTime();
	}

	public String getName()
	{
		return name;
	}

	public double getSalary()
	{
		return salary;
	}

	public Date getHireDay()
	{
		return hireDay;
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise=salary*byPercent/100;
		salary+=raise;
	}

	private String name;
	private double salary;
	private Date hireDay;
}


class Manager extends Emploree
{
	/**
	 * @param aname the name
	 * @param asalary the salary
	 * @param ayear the hire year
	 * @param amonth the hire month
	 * @param aday the hire day
	 */

	public Manager(String aname,double asalary,int ayear,int amonth,int aday)
	{
		super(aname,asalary,ayear,amonth,aday);
		bonus=0;
	}

	public double getSalary()
	{
		double baseSalary=super.getSalary();
		return baseSalary+bonus;
	}

	public void setBonus(double b)
	{
		bonus=b;
	}

	private double bonus;
}


public class managerinheritanceTestDrive
{
	public static void main(String[] args)
	{
		Manager b=new Manager("cal",80000,1987,12,15);
		Emploree e=b;
		Manager boss=(Manager)e;
		boss.setBonus(5000);
		System.out.println("name:"+boss.getName()+"salary:"+boss.getSalary());
	}
}
