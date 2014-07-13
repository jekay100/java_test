/**
 * @file Name: calenderTest.java
 * @description:
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-5-23 19:14:00
 */

import java.util.*;
public class calenderTest
{

	public static void main(String[] args)
	{

		//output the static field of clendar
		System.out.println(Calendar.DAY_OF_MONTH);
	
		//get the object of calendar class
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.getTime());
		
		//set the time field
		cal.set(Calendar.MONTH,10);
		System.out.println(cal.getTime());

		//add the value to the field without the limits
		cal.add(Calendar.MONTH,12);
		System.out.println(cal.getTime());
							
		//add the value to the field with the limits
		cal.roll(Calendar.MONTH,12);
		System.out.println(cal.getTime());
	}

}
