/**
 * @file Name: hashSetTest2.java
 * @description:
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-5-26 16:00:13
 */
//the use and override of hashcode() in the HashSet
//the override of equals()
import java.util.*;
class A
{
	private int count;
	private String name;
	public A(int acount,String aname)
	{
		this.count=acount;
		this.name=aname;
	}

	//类的判等equals()重写。
	public boolean equals(Object obj)
	{
		if(this==obj)
		{
			return true;
		}

		if(obj!=null&&obj.getClass()==A.class)
		{
			A targetobj=(A)obj;
			if(this.count==targetobj.count&&this.name.equals(targetobj.name))
			{
				return true;
			}
		}
		return false;
	}
	
	public int f()
	{
		return this.count;
	}
	//the use of hashcode()
	public int hashCode()
	{
		return this.name.hashCode()+this.count;
	}
}

public class hashSetTest2
{

	public static void main(String[] args)
	{
		HashSet<A> ha = new HashSet<>();
		ha.add(new A(1,"lio"));
		ha.add(new A(1,"lio"));
		ha.add(new A(1,"lio"));

		System.out.println(ha);
		for(A a:ha)
		{
			System.out.println(a.f());
		}
	}

}
