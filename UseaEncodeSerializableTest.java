/**
 * @file Name: UseaEncodeSerializableTest.java
 * @description:Test the default serializable of object
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-1 13:37:00
 */
import java.io.*;
//the class must implements the Serializable interface that it can be serialized
class user implements Serializable
{
	private String name;
	private String password;
	user()
	{
		this.name = "zhang";
		this.password = "red";
	}
	user(String aname,String apassword)
	{
		this.name=aname;
		this.password=apassword;
	}
	public void setname(String aname)
	{
		this.name=aname;
	}
	public void setpassword(String apassword)
	{
		this.password=apassword;
	}
	public String getname()
	{
		return this.name;
	}
	public String getpassword()
	{
		return this.password;
	}
	
	public String toString()
	{
		String str = "user "+this.name+" "+this.password;
		return str;
	}
	
	//set method to encode the password by yourself that it can not be get after the serialization
	private void writeObject(ObjectOutputStream out) throws IOException
	{
		out.writeUTF(this.name);
		//you can encode the Field with the method you want
		out.writeUTF(new StringBuilder(this.password).reverse().toString());
	}
	//set method to read the fields but you can not decode the password
	private void readObject(ObjectInputStream in) throws IOException
	{
		this.name = in.readUTF();
		this.password = in.readUTF();
	}
}

public class UseaEncodeSerializableTest
{
	public static void main(String[] args) throws Exception
		{
			user us = new user("lisi","123");
			//after the finish of the program,the ap object will perish
		//	System.out.println(us);
			
			//write the us object into the file and save it in the disk in binary stream form with the ObjectOutputStream class and the Field has been encoded then it can be saved or passed through the web
			FileOutputStream fos = new FileOutputStream("user.bin"); 
			ObjectOutputStream ops = new ObjectOutputStream(fos); 
			ops.writeObject(us);
			
			//read the object from the file stored in the disk , but can not decode the password
			FileInputStream fis = new FileInputStream("user.bin"); 
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object bp = ois.readObject();
			user mp = (user)bp;
			System.out.println(mp.getpassword());
		}	
}