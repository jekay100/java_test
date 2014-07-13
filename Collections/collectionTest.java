/**
 * @file Name: collectionTest.java
 * @description:
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-5-26 12:56:10
 */
import java.util.*;
public class collectionTest
{

	public static void main(String[] args)
	{

		Collection<String> c1 = new HashSet<>();
		c1.add("hello");
		c1.add("world");
		System.out.println(c1.contains("hello"));

		//transver the collection with foreach
		for(String elem:c1)
		{
			System.out.println(elem);
		}

		Iterator it = c1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}


		

	}

}
