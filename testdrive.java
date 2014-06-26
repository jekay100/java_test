/*************************************************************************
    > File Name: testdrive.java
    > Author: trilever
    > Mail: trilever31204@gmail.com 
    > Created Time: 2014年04月27日 星期日 13时48分33秒
    >First java push. The use of Java IO class. And how to slit the String into the length you want.
 ************************************************************************/
import java.io.*;
class emploryee
{
	String name;
	int age;
	final static int LEN=8;
	public emploryee()
	{
		name="wt";
		age=23;
	}

	public emploryee(String n,int s)
	{
		if(n.length()>=LEN)
		{
			n=n.substring(0,8);
		}

		else
		{
			while(n.length()<LEN)
			{
				n=n+"\u0000";
			}
		}

		age=s;
		name=n;
	}
}
class testdrive
{

	public static void main(String[] args)throws Exception
	{
		emploryee e1=new emploryee("lsan",21);
		emploryee e2=new emploryee("lisi",22);
		emploryee e3=new emploryee("wangdfsdfsdsau",23);

		RandomAccessFile ra=new RandomAccessFile("./em.txt","rw");

		ra.write(e1.name.getBytes());
		ra.writeInt(e1.age);
		ra.write(e2.name.getBytes());
		ra.writeInt(e2.age);
		ra.write(e3.name.getBytes());
		ra.writeInt(e3.age);

		ra.close();

		RandomAccessFile rb=new RandomAccessFile("./em.txt","r");
		System.out.println("Third one");
		rb.skipBytes(12);
		String str="";
		for(int i=0;i<8;i++)
		{
			str=str+(char)rb.readByte();
		}

		System.out.println(str);
		System.out.println(rb.readInt());
		
		System.out.println("second one");
		str="";
		for(int i=0;i<8;i++)
		{
			str=str+(char)rb.readByte();
		}

		System.out.println(str.trim());
		System.out.println(rb.readInt());
	
		System.out.println("First one");
		rb.seek(0);
		str="";
		for(int i=0;i<8;i++)
		{
			str=str+(char)rb.readByte();
		}

		System.out.println(str);
		System.out.println(rb.readInt());

	}
}
