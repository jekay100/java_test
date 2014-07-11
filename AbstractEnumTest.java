/**
 * @file Name: AbstractEnumTest.java
 * @description:test abstract enum
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-5-30 16:00:00
 */
enum seasons
{
	spring()//use anonymous class to construct an object
	{
		public void infor()
		{
			System.out.println("spring");
		}
	},//attention to the simbol
	summer()
	{
		public void infor()
		{
			System.out.println("summer");
		}
	},
	autumn()
	{
		public void infor()
		{
			System.out.println("autumn");
		}
	},
	winter()
	{
		public void infor()
		{
			System.out.println("winter");
		}
	};

	public abstract void infor();
}
	
public class AbstractEnumTest
{
	public static void main(String[] args)
	{
		System.out.println("hello world");

		seasons.spring.infor();
		seasons.summer.infor();
		seasons.autumn.infor();
		seasons.winter.infor();
	}
}