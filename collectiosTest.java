/**
 * @file Name: collectiosTest.java
 * @description:
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-5-28 19:49:27
 */
import java.util.*;
public class collectiosTest
{

	public static void main(String[] args)
	{
		List<String> ls = new ArrayList<>();
		
		ls.add("hi");
		ls.add("hello");
		ls.add("good");
		System.out.println(ls);

		//reverse the List
		Collections.reverse(ls);
		System.out.println(ls);

		//swap the specific elems in the list
		Collections.swap(ls,1,2);
		System.out.println(ls);

		//shuffle the elems in the list
		Collections.shuffle(ls);
		System.out.println(ls);
	}

}
