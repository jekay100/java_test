/**
 * @file Name: systemTest.java
 * @description:
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-5-23 10:38:39
 */
import java.util.*;

public class systemTest 
{

	public static void main(String[] args)
	{

		//get the system environment of xp
		System.out.println((System.getenv()));
		//get the specific system environment of xp
		System.out.println((System.getenv("path")));
		
		//get the properities of the system xp
		Properties pros = System.getProperties();
		//list the properities of xp onto screeen(out)
		pros.list(System.out);
		
	}

}
