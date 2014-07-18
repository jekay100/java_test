/**
* @file Name: LazysingleTonTest.java
* @description:懒汉式单态类
* @author : trilever
* @version : 1.0
* @mail: trilever31204@gmail.com
* @created Time: 2014-7-18 19:14:00
*/
public class LazysingleTon
{
	public int a=10;
	private LazysingleTon() //创建private构造器，防止JDK自己创建构造器
	{
	}
	private static LazysingleTon h=new LazysingleTon(); //创建static field，用于缓存创建的单例对象，同时检测是否单例。
	public static LazysingleTon f() //创建static方法，以创建单例对象，返回该对象引用。
	{
		return h;
  }
}
public class LazysingleTonTest
{
	public static void main(String[] args)
	{
		System.out.println(LazysingleTon.f().a); //使用static单例对象创建方法来创建单例。
	}
}
