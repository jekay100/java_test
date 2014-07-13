/**
 * @file Name: appleSerializableTestb.java
 * @description:Test the serializable of object
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-7-1 8:56:00
 */
import java.io.*;
//the class must implements the Serializable interface that it can be serialized
class Student implements Serializable
{
	private String name;
	private Teacher teacher;
	Student()
	{
	}
	Student(String aname,Teacher ateacher)
	{
		this.name=aname;
		this.teacher=ateacher;
	}
	public void setname(String aname)
	{
		this.name=aname;
	}
	public void setteacher(Teacher ateacher)
	{
		this.teacher=ateacher;
	}
	public String getname()
	{
		return this.name;
	}
	public Teacher getteacher()
	{
		return this.teacher;
	}
	
	public String toString()
	{
		String str = "student "+this.name+" "+this.teacher.toString();
		return str;
	}
}
class Teacher implements Serializable
{
	private String name;
	private int age;
	Teacher()
	{
	}
	Teacher(String aname,int aage)
	{
		this.name=aname;
		this.age=aage;
	}
	public void setname(String aname)
	{
		this.name=aname;
	}
	public void setage(int aage)
	{
		this.age=aage;
	}
	public String getname()
	{
		return this.name;
	}
	public int getage()
	{
		return this.age;
	}
	
	public String toString()
	{
		String str = "teacher "+this.name+" "+this.age;
		return str;
	}
}
public class appleSerializableTestb
{
	public static void main(String[] args) throws Exception
		{
			Teacher tea = new Teacher("liu",23);
			Student stu = new Student("lisi",tea);
			//after the finish of the program,the ap object will perish
			System.out.println(stu);
			
			FileOutputStream fos = new FileOutputStream("stu.bin"); 
			ObjectOutputStream ops = new ObjectOutputStream(fos); 
			//write the stu object into the file and save it in the disk in binary stream form with the ObjectOutputStream class
			ops.writeObject(stu); 
			
			tea.setname("hu");
			tea.setage(50);
			//do not write the tea object into the file and do not save it in the disk in binary stream form with the ObjectOutputStream class again, because this object has been serialized in the object stu that it can not been serialized again
			ops.writeObject(tea); 
			
			FileInputStream fis = new FileInputStream("stu.bin"); 
			ObjectInputStream ois = new ObjectInputStream(fis);
			//read the stu object from the file stored in the disk 
			Object bp = ois.readObject();
			//read the tea object from the file stored in the disk 
			//but the alteration of tea can not be read because the changed object can not be serialized 
			Object cp = ois.readObject();
			Student mp = (Student)bp;
			Teacher np = (Teacher)cp;
			System.out.println(mp.getname());
			System.out.println(np.getname());
		}	
}