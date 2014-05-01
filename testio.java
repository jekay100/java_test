/*************************************************************************
    > File Name: testio.java
    > Author: trilever
    > Mail: trilever31204@gmail.com 
    > Created Time: 2014-5-1 18:50:14
 ************************************************************************/
import java.util.*;
import java.io.Console;
public class testio
{
	public static void main(String[] args)
	{
		System.out.println("Input your name:");
		Scanner in=new Scanner(System.in);
		String name=in.nextLine();
	//	System.out.println(name);

		System.out.println("Input your code:");
		Console inc=System.console();
		char[] psw=inc.readPassword("passwd");
		System.out.println(psw);

	}
}
