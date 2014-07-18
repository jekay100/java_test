/**
 * @file Name: URLConnectionTest.java
 * @description:Test the URLConnectionTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-9 11:30:00
 */
import java.net.*;
import java.io.*;
public class URLConnectionTest
{
	public static void main(String[] args)  throws Exception
	{
		//URL means the name and path of the file in the host server 
		URL u = new URL("http://www.sohu.com/");
		//get the urlconnection, it is the conection between local machine and host server
		URLConnection uc = u.openConnection();
		
		System.out.println(uc); 
		InputStream is = uc.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		while(br.readLine()!=null)
		{
			System.out.println(br.readLine());
		}
	}
}



