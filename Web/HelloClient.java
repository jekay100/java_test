/*************************************************************************
    > File Name: HelloClient.java
    > Author: trilever
    > Mail: trilever31204@gmail.com 
    > Created Time: 2014年04月29日 星期二 10时46分08秒
 ************************************************************************/
import java.io.*;
import java.net.*;
public class HelloClient
{
	public static void main(String[] args)throws IOException
	{
		Socket hellosocket=null;
		BufferedReader in = null;
		try
		{
			hellosocket=new Socket("localhost",9999);
			in=new BufferedReader(new InputStreamReader(hellosocket.getInputStream()));
		}

		catch(UnknownHostException e)
		{
			System.err.println("Do not know the localhost");
			System.exit(1);
		}

		catch(IOException e)
		{
			System.err.println("can not IO");
			System.exit(1);
		}

		System.out.println(in.readLine());
		in.close();
		hellosocket.close();
	}
}
