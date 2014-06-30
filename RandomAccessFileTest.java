/**
 * @file Name: RandomAccessFileTest.java
 * @description: RandomAccessFileTest
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-6-30 15:03:00
 */
import java.io.*;
public class RandomAccessFileTest
{
	public static void main(String[] args) throws Exception
	{
		//random seek the position
		RandomAccessFile raf = new RandomAccessFile("good.txt","rw");
		
		//read the file
		byte[] br =  new byte[1024];
		raf.read(br);
		String tempstr = new String(br);
		System.out.println(tempstr);
	
		//write into the file at the end postion of the file
		raf.seek(raf.length());
		String tempstr1 = new String("hello world!");
		byte[] br2 = tempstr1.getBytes();
		raf.write(br2);
	
		//insert into the file at the specified position
		//save the contents after the position into the ByteArrayOutputStream object
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		byte[] br3 = new byte[1024];
		raf.seek(100);
		int hasRead = -1;
		while((hasRead=raf.read(br3))!=-1)
		{
			bos.write(br3,0,hasRead);
		}
		
		//insert the string you want into the postion
		raf.seek(100);
		String tempstr2 = new String("hello world!");
		byte[] br4 = tempstr2.getBytes();
		raf.write(br4);
		
		//insert the contents that have been saved into the end of the file currently
		raf.seek(raf.length());
		byte[] br5 =bos.toByteArray();
		raf.write(br5);
	}	 
}