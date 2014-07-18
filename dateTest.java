/**
 * @file Name: dateTest.java
 * @description:
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-5-23 14:33:57
 */
import java.util.*;
public class dateTest
{

	public static void main(String[] args)
	{

		//initialize the date with default empty constructor_
		Date de=new Date();
		System.out.println(de);
		
		//get the currentTimeMillis from 1970
		System.out.println(System.currentTimeMillis());

		//initialize the date with default empty constructor_
		de=new Date(System.currentTimeMillis()-3*24*60*60*1000);
		System.out.println(de);

	}

}
