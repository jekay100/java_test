/**
* @file Name: HungrysingleTonTest.java
* @description:饿汉式单态类
* @author : trilever
* @version : 1.0
* @mail: trilever31204@gmail.com
* @created Time: 2014-7-18 10:47:00
*/
class HungrysingleTon
{
	public int a = 10;
	
	private HungrysingleTon() //创建private构造器，防止JDK自己创建构造器
	{
	}
	private static HungrysingleTon h; //创建static field，用于缓存创建的单例对象，同时检测是否单例。
	public static HungrysingleTon f() //创建static方法，以创建单例对象，返回该对象引用。
	{
		if(h==null)
		{
			h=new HungrysingleTon();
		}
		return h;
	}
}

public class HungrysingleTonTest
{
	public static void main(String[] args)
	{
		System.out.println(HungrysingleTon.f().a); //使用static单例对象创建方法来创建单例。
	}
}
