/**
 * @file Name: URLTest.java
 * @description:Test the URLTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-9 11:05:00
 */
import java.net.*;
import java.io.*;
public class URLTest
{
	public static void main(String[] args)  throws Exception
	{
		//URL means the name and path of the file in the host server 
		URL u = new URL("http://www.sohu.com/");
		System.out.println(u);
		System.out.println(u.getProtocol());
		System.out.println(u.getFile());
		System.out.println(u.getHost());  
		
		InputStream is = u.openStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		while(br.readLine()!=null)
		{
			System.out.println(br.readLine());
		}
	}
}



