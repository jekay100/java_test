/**
 * @file Name: ArrayStreamTest.java
 * @description:The use of the class ArrayStreamIO
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-6-28 14:01:00
 */
import java.io.*;
public class ArrayStreamTest
{
	public static void main(String[] args) throws Exception
	{
		//construct a ByteArrayOutputStream,just like get a pipe without water in it.that you can pipe water into it.
		ByteArrayOutputStream bos = new ByteArrayOutputStream();

		byte[] buffer = "hello".getBytes();
		bos.write(buffer);
		
		byte[] content = bos.toByteArray();
		for(byte b : content)
		{
			System.out.println((char)b);
		}
	}
}