/**
 * @file Name: listTest.java
 * @description:
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-5-28 16:43:40
 */
import java.util.*;
public class listTest
{

	public static void main(String[] args)
	{

		List<String> ls = new ArrayList<>();
		ls.add("hello");
		ls.add("world");
		ls.add("good");
		System.out.println(ls);
		
		//add the elem with the specific index
		ls.add(2,"ms");
		System.out.println(ls);

		//set the elem in the arraylist
		ls.set(1,"linux");
		System.out.println(ls);
		
		//remove the elem in the arraylist
		ls.remove(3);
		System.out.println(ls);
		
		//transever the arraylist
		for(int i=0;i<ls.size();i++)
		{
			System.out.println(ls.get(i));
		}
		
	}

}
