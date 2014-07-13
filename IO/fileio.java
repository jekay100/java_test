/*************************************************************************
    > File Name: fileio.java
    > Author: trilever
    > Mail: trilever31204@gmail.com 
    > Created Time: 2014-5-2 9:44:53
 ************************************************************************/
import java.util.*;
import java.io.*;

class fileio
{
	public static void main(String[] args)throws Exception
	{
		//input string and output the string.Link the console input and output.
		PrintWriter fileinp=new PrintWriter(System.out);//流连接一端
		fileinp.write("hello");//流连接另一端
		fileinp.close();
		
		//input string and output the string. Link the input and the file.
		PrintWriter fileinp1=new PrintWriter(new File("hello.txt"));//流连接一端
		fileinp1.write("hello");//流连接另一端
		fileinp1.close();
		
		//read from the input and output the string.
		System.out.println("input:");
		Scanner fileoup2=new Scanner(System.in);//流连接一端
		String str=fileoup2.nextLine();//流连接另一端
	    System.out.println(str);
		fileoup2.close();
    
    
		//read from the file and output the string.
		Scanner fileoup3=new Scanner(new File("hello.txt"));//流连接一端
		String str1=fileoup3.nextLine();//流连接另一端
		System.out.println(str1);
		fileoup3.close();
	}
}
