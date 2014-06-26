/*************************************************************************
    > File Name: managerinheritanceTestDrive.java
    > Author: trilever
    > Version: 1.0
    > Mail: trilever31204@gmail.com 
    > Created Time: 2014-5-7 10:14:33
    > The program demonstrates and tansformation
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
		Manager b=new Manager("cal",80000,1987,12,15);//这样建立一个子类变量k
		Emploree e=b//这样是向上造型，将子类对象转换为父类对象，这样可以实现多态，但是转换后的父类变量e并不能调用子类中独有的方法f（），只能调用父子类都有的方法。
		Manager boss=(Manager)e//这样就是向下造型。类型强制转换。将向上造型获得的父类变量还原成他原来的类型。
		boss.setBonus(5000//这样可以通过向下造型获得的子类对象来调用子类独有的方法。
		System.out.println("name:"+boss.getName()+"salary:"+boss.getSalary());
	}
}
