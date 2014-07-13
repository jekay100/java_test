/**
 * @file Name: StreamReadertransTest.java
 * @description:The use of the class DataStream.
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-6-30 10:15:00
 */
import java.io.*;
public class StreamReadertransTest
{
	public static void main(String[] args) throws Exception
	{
		//this part is aimed at reading the file and printing it onto the screen
		//construct args Stream class object
		FileInputStream fis= new FileInputStream("E:/Java_source/fileStreamTest.java");
		
		//transform the stream class object(file object) into a reader class object
		InputStreamReader reader = new InputStreamReader(fis);

		//transform the reader class object into a Bufferedreader class object
		BufferedReader br = new BufferedReader(reader);

		//use the readLine() func of BufferedReader to read a line in the text
		String tempstr = null;
		while((tempstr = br.readLine())!=null)
		{
			System.out.println(tempstr);
		}

		
		//this part is aimed at reading the keyboard and printing it onto the screen
		//transform the stream object(System.in is the keybord) into a reader class
		InputStreamReader reader1 = new InputStreamReader(System.in);

		//transform the reader class into a Bufferedreader class
		BufferedReader br1 = new BufferedReader(reader1);

		//use the readLine() func of BufferedReader to read a line in the text
		String tempstr1 = null;
		while((tempstr1 = br1.readLine())!=null)
		{
			System.out.println(tempstr1);
		}
	}
}
