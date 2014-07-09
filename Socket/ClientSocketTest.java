/**
 * @file Name: ClientSocketTest.java
 * @description:Test the ClientSocketTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-9 19:53:00
 */
import java.net.*;
import java.io.*;
public class ClientSocketTest
{
	public static void main(String[] args) 	throws Exception	
	{
			try
			{
				//construct an InetAddress object
				 InetAddress iad = InetAddress.getByAddress(new byte[]{10,23,94,(byte)225});
				//connect to the server
				Socket s = new Socket(iad,30000);
				
				//no matter when and where to output, you'd better transform the OutputStream into the PrintStream object.
				//no matter when and where to input, you'd better transform the InputStream into the BufferedReader object.
				
				//read from the inputstream which came from the server socket.
				InputStreamReader isr = new InputStreamReader(s.getInputStream());
				BufferedReader br = new BufferedReader(isr);
				System.out.println(br.readLine());
				
				//write into the printStream which link to the server socket
				PrintStream ps = new PrintStream(s.getOutputStream());
				ps.println("hello");
			}
			catch(Exception e)
			{
				System.out.println("error");
			}
		}	
}