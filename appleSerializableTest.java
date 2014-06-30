/**
 * @file Name: appleSerializableTest.java
 * @description:Test the serializable of object
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-6-30 19:41:00
 */
import java.io.*;
//the class must implements the Serializable interface that it can be serialized
class apple implements Serializable
{
	private String name;
	private String color;
	apple()
	{
		this.name = "zhang";
		this.color = "red";
	}
	apple(String aname,String acolor)
	{
		this.name=aname;
		this.color=acolor;
	}
	public void setname(String aname)
	{
		this.name=aname;
	}
	public void setcolor(String acolor)
	{
		this.color=acolor;
	}
	public String getname()
	{
		return this.name;
	}
	public String getcolor()
	{
		return this.color;
	}
	
	public String toString()
	{
		String str = "apple "+this.name+" "+this.color;
		return str;
	}
}

public class appleSerializableTest
{
	public static void main(String[] args) throws Exception
		{
			apple ap = new apple("lisi","red");
			//after the finish of the program,the ap object will perish
			System.out.println(ap);
			
			//write the ap object into the file and save it in the disk in binary stream form with the ObjectOutputStream class
			FileOutputStream fos = new FileOutputStream("apple.bin"); 
			ObjectOutputStream ops = new ObjectOutputStream(fos); 
			ops.writeObject(ap); 
			
			//read the object from the file stored in the disk 
			FileInputStream fis = new FileInputStream("apple.bin"); 
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object bp = ois.readObject();
			apple mp = (apple)bp;
			System.out.println(mp.getname());
		}	
	
}