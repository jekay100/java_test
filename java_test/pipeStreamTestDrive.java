/*************************************************************************
    > File Name: pipeStreamTestDrive.java
    > Author: trilever
    > Mail: trilever31204@gmail.com 
    > Created Time: 2014年04月28日 星期一 14时25分45秒
 ************************************************************************/
import java.io.*;

class sender extends Thread
{
	private PipedOutputStream out=new PipedOutputStream();
	public  PipedOutputStream getPipeOutputStream()
	{
		return out;
	}
	public void run()
	{
		String s=new String("hi,how are you");

		try
		{
			out.write(s.getBytes());
			out.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

class reciever extends Thread
{
	private PipedInputStream in=new PipedInputStream();
	public PipedInputStream getPipeInputStream()
	{
		return in;
	}
	public void run()
	{
		byte[] buf=new byte[1024];
		String str=null;
		try
		{
			int len=in.read(buf);
			str=new String(buf,0,len);
			System.out.println(str);
			in.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}


public class pipeStreamTestDrive
{
	public static void main(String args[])throws Exception
	{
		sender s=new sender();
		reciever r=new reciever();
		PipedOutputStream outs=s.getPipeOutputStream();
		PipedInputStream ins=r.getPipeInputStream();
		outs.connect(ins);
		s.start();
		r.start();
	}
}
