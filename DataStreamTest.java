/**
 * @file Name: DataStreamTest.java
 * @description:The use of the class DataStream.
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-6-30 8:40:00
 */
import java.io.*;
public class DataStreamTest
{
	public static void main(String[] args) throws Exception
	{
		//construct a Stream class
		FileOutputStream fis= new FileOutputStream("E:/Java_source/fileStreamTest1.java");
		
		//construct the DataOutputStream. 
		DataOutputStream dos = new DataOutputStream(fis);

		//write the string into the file
		String tempstr = new String("hello");
		dos.writeBytes(tempstr);
		dos.close();
		
		//construct a Stream class
		FileInputStream fis1= new FileInputStream("E:/Java_source/fileStreamTest.java");

		//construct the DataInputStream.
		DataInputStream dis = new DataInputStream(fis1);
		
		//read the string from the file
		byte[] by = new byte[1280];
		dis.readFully(by); 
		String str = new String(by);
		System.out.println(str);
		dis.close();

	}
}