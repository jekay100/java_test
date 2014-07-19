/**
 * @file Name: StreamReaderTest.java
 * @description:The use of the class StreamReader:tranform the stream class into reader class. and the use of BufferedReader class.
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-6-28 20:23:00
 */
import java.io.*;
public class StreamReaderTest
{
	public static void main(String[] args) throws Exception
	{
		//construct args Stream class
		FileInputStream fis= new FileInputStream("E:/Java_source/fileStreamTest.java");
		
		//transform the stream class into a reader class
		InputStreamReader reader = new InputStreamReader(fis);

		//transform the reader class into a Bufferedreader class
		BufferedReader br = new BufferedReader(reader);

		//use the readLine() func of BufferedReader to read a line in the text
		String tempstr = null;
		while((tempstr = br.readLine())!=null)
		{
			System.out.println(tempstr);
		}
		
	}
}