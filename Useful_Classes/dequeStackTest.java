/**
 * @file Name: dequeStackTest.java
 * @description:
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-5-28 18:59:15
 */
import java.util.*;
public class dequeStackTest
{

	public static void main(String[] args)
	{

		Deque<String> de = new ArrayDeque<>();

		//push the elems into the ArrayDeque
		de.push("hi");
		de.push("hello");
		de.push("world");
		de.push("that");
		de.push("is");

		//pop the elems out of the ArrayDeque
		System.out.println(de.pop());
		System.out.println(de.pop());
		System.out.println(de.pop());
		System.out.println(de.pop());
		System.out.println(de.pop());

		de.push("hi");
		de.push("hello");
		de.push("world");
		de.push("that");
		de.push("is");
		
		//peek the elems of the ArrayDeque, peek but not remove
		System.out.println(de.peek());
		de.pop();
		System.out.println(de.peek());
		de.pop();
		System.out.println(de.peek());
		de.pop();
		System.out.println(de.peek());
		de.pop();
		System.out.println(de.peek());
		de.pop();
	}

}
