/**
 * @file Name: EnumTest.java
 * @description:test enum
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-5-30 16:00:00
 */	
enum Gender
{	
	Male(),//use the default constructor without parameters to construct an object
	Female("woman");//just like: Gender Female=new Gender("woman")；construct an object
	String name;
	Gender()//default constructor without parameters 
	{
		name="man";
	}
	Gender(String agender)//constructor with parameters
	{
		name=agender;
	}
}

public class EnumTest
{
	public static void main(String[] args)
	{
		System.out.println("hello world");

		System.out.println(Gender.Male.name);//Male Object's Field
		System.out.println(Gender.Female.name);//Female Object's Field
	}
}
