/*************************************************************************
    > File Name: managerTestDrive.java
    > Author: trilever
    > Version: 1.0
    > Mail: trilever31204@gmail.com 
    > Created Time: 2014-5-7 10:14:33
    > The program demonstrates inheritance
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


public class managerTestDrive
{
	public static void main(String[] args)
	{
		Manager boss=new Manager("cal",80000,1987,12,15);
		boss.setBonus(5000);

		Emploree[] staff=new Emploree[2];

		staff[0]=boss;
		staff[1]=new Emploree("li",30000,1990,10,12);

		for(Emploree e :staff)
			System.out.println("name:"+e.getName()+"salary:"+e.getSalary());
	}
}
