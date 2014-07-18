package com.trilever;

class singleTon
{
	public int a = 10;
	private singleTon() //创建private构造器，防止JDK自己创建构造器
	{
	}
	private static singleTon h; //创建static field，用于缓存创建的单例对象，同时检测是否单例。
	public static singleTon f() //创建static方法，以创建单例对象，返回该对象引用。
	{
		if(h==null)
		{
			h=new singleTon();
		}
		return h;
	}
}

public class singletonTest
{
	public static void main(String[] args)
	{
		System.out.println(singleTon.f().a); //使用static单例对象创建方法来创建单例。
	}
}