/**
 * @file Name: hashSetTest.java
 * @description:
 * @author : trilever
 * @version : 1.0
 * @mail: trilever31204@gmail.com 
 * @created Time: 2014-5-30 16:00:00
 */
import java.util.*;
class apple
{
	String color;
	double weight;
	public apple()
	{
		this.color = "red";
		this.weight = 10.0;
	}

	public apple(String acolor,double aweight)
	{
		this.color = acolor;
		this.weight = aweight;
	}

	//the override of toString()
	@Override
	public String toString()
	{
		return "apple[color:"+this.color+"weight:"+this.weight+"]";
	}
	//the override of equals()
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		
		if(obj!=null&&obj.getClass()==apple.class)
		{
			apple app = (apple)obj;
			if((this.weight==app.weight)&&(this.color.equals(app.color)))
			{
				return true;
			}

		}

		return false;
	}
	//the override of hashcode()
	@Override
	public int hashCode()
	{
		return color.hashCode()+(int)weight;
	}
}
public class hashSetTest
{

	public static void main(String[] args)
	{
		//the use of LinkedHashSet
		//class String has it's own equals() and hashcode() method.
		LinkedHashSet<String> hp = new LinkedHashSet<>();
		hp.add("张三");
		hp.add("李四");
		hp.add("王五");
		hp.add("赵六");
		System.out.println(hp);

		//the use of HashSet
		//class apple do not has it's own equals() and hashcode() method.
		HashSet<apple> hp1 = new HashSet<>();
		hp1.add(new apple("green",4.3));
		hp1.add(new apple("blue",6.7));
		hp1.add(new apple("black",5.3));

		System.out.println(hp1);
	}

}

