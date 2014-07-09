/**
 * @file Name: ServerSocketTest.java
 * @description:Test the ServerSocketTest class
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-9 19:53:00
 */
import java.net.*;
import java.io.*;
public class ServerSocketTest
{
	public static void main(String[] args) throws Exception
		{
			ServerSocket ssc = new ServerSocket(30000); 
			System.out.println("Waiting for connections......");
			Socket sk = ssc.accept();
			
			//no matter when and where to output, you'd better transform the OutputStream into the PrintStream object.
			//no matter when and where to input, you'd better transform the InputStream into the BufferedReader object.
			
			//write into the printStream which link to the client socket
			PrintStream ps = new PrintStream(sk.getOutputStream());
			ps.println("hi");
			
			//read from the inputstream which came from the client socket.
			InputStreamReader isr = new InputStreamReader(sk.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			System.out.println(br.readLine());
		}	
}