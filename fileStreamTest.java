/**
 * @file Name: fileStreamTest.java
 * @description:The use of the class FileStreamIO
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-6-28 9:32:00
 */
import java.io.*;
import java.util.*;
public class fileStreamTest
{
	public static void main(String[] args) throws Exception
	{
		//construct a fileinputstream,just like get a pipe with water in it.that you can pipe the water into the RAM.
		FileInputStream fis = new FileInputStream("E:/Java_source/fileStreamTest.java");

		//read the file by one byte
		System.out.print((char)fis.read());

		//read all the file by bytes 
		byte[] buffer1 = new byte[64];
		int len1 = 1;
		while((len1 = fis.read(buffer1))!=-1)
		{
			System.out.print(new String(buffer1,0,len1));
		}
		
		//read the file by bytes into a specified length buffer arrays 
		FileInputStream fis1 = new FileInputStream("E:/Java_source/fileStreamTest.java");
		byte[] buffer = new byte[128];
		fis1.read(buffer);
		System.out.println(new String(buffer));

		//output into the file with the FileOutputStream class 
		FileOutputStream fis2 = new FileOutputStream("E:/Java_source/2.java");
		byte[] buffer3 = "hello".getBytes();
		fis2.write(buffer3);
		fis2.close();
	}
}