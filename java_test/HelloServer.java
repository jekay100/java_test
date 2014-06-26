/*************************************************************************
    > File Name: HelloServer.java
    > Author: trilever
    > Mail: trilever31204@gmail.com 
    > Created Time: 2014年04月29日 星期二 10时27分26秒
 ************************************************************************/
import java.io.*;
import java.net.*;
public class HelloServer
{
	public static void main(String[] args)throws IOException
	{
		ServerSocket serversocket=null;
		PrintWriter out=null;
		try
		{
			serversocket=new ServerSocket(9999);
			
		}
		catch(IOException e)
		{
			System.err.println("Could not listen to the port of 9999");
			System.exit(1);

		}

		Socket clientsocket=null;

		try
		{
			clientsocket=serversocket.accept();
		}

		catch(IOException e)
		{
			System.err.println("Accepted failed");
			System.exit(1);

		}

		out=new PrintWriter(clientsocket.getOutputStream(),true);
		out.println("hello world");
		clientsocket.close();
		serversocket.close();
	}
}
